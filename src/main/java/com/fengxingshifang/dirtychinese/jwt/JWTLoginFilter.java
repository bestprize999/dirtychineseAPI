package com.fengxingshifang.dirtychinese.jwt;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fengxingshifang.dirtychinese.dao.InfoMapper;
import com.fengxingshifang.dirtychinese.dao.UserMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {
	
	private final Logger logger = LoggerFactory.getLogger(JWTLoginFilter.class);
	
	
    private AuthenticationManager authenticationManager;
    private UserMapper userDao;

    public JWTLoginFilter(AuthenticationManager authenticationManager, UserMapper userDao) {
        this.authenticationManager = authenticationManager;
      this.userDao = userDao;
    }

//	@Autowired
//	UserMapper userDao;
//  public JWTLoginFilter(UserMapper userDao) {
//      this.userDao = userDao;
//  }

	
	@Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
    	

        try {
        	com.fengxingshifang.dirtychinese.entity.User user = new ObjectMapper()
                    .readValue(req.getInputStream(), com.fengxingshifang.dirtychinese.entity.User.class);
        	com.fengxingshifang.dirtychinese.entity.User applicationUser = userDao.findByUserId(user.getUserid());
        	GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(applicationUser.getRole()); 
            Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        	auths.add(grantedAuthority); 

            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            user.getUserid(),
                            user.getUserpassword(),
//                            new ArrayList<>())
                            auths)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest req,
                                            HttpServletResponse res,
                                            FilterChain chain,
                                            Authentication auth) throws IOException, ServletException {

        String token = Jwts.builder()
                .setSubject(((User) auth.getPrincipal()).getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 1000))
//                .setExpiration(new Date(System.currentTimeMillis() + 1000*30))
                .signWith(SignatureAlgorithm.HS512, "MyJwtSecret")
                .compact();
        res.addHeader("Authorization", "Bearer " + token);
    }
    
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {

        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
//        response.getOutputStream().println(JSONResult.fillResultString(500, "Internal Server Error!!!", JSONObject.NULL));
    }

}