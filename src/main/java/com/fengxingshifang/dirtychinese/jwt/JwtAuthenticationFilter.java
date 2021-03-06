package com.fengxingshifang.dirtychinese.jwt;



import io.jsonwebtoken.Jwts;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.fengxingshifang.dirtychinese.dao.UserMapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class JwtAuthenticationFilter extends BasicAuthenticationFilter {
    public JwtAuthenticationFilter(AuthenticationManager authManager, UserMapper userDao) {
        super(authManager);
        this.userDao = userDao;
   }
    private UserMapper userDao;

    @Override
    protected void doFilterInternal(HttpServletRequest req,
                                    HttpServletResponse res,
                                    FilterChain chain) throws IOException, ServletException {
        String header = req.getHeader("Authorization");

        if (header == null || !header.startsWith("Bearer ")) {
            chain.doFilter(req, res);
            return;
        }

        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);

        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req, res);
    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token != null) {
            // parse the token.
            String userId = Jwts.parser()
                    .setSigningKey("MyJwtSecret")
                    .parseClaimsJws(token.replace("Bearer ", ""))
                    .getBody()
                    .getSubject();
        	com.fengxingshifang.dirtychinese.entity.User applicationUser = userDao.findByUserId(userId);

            if (userId != null) {
            	GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(applicationUser.getRole()); 
                Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
            	auths.add(grantedAuthority); 
//                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
              return new UsernamePasswordAuthenticationToken(userId, applicationUser.getUserpassword(), auths);
            }
            return null;
        }
        return null;
    }
}
