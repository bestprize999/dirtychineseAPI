package com.fengxingshifang.dirtychinese.jwt;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fengxingshifang.dirtychinese.dao.UserMapper;

import static java.util.Collections.emptyList;

@Service
@EnableAutoConfiguration
public class UserDetailsServiceImpl implements UserDetailsService {
//    private UserMapper userDao;
	@Autowired
	UserMapper userDao;
	
//    public UserDetailsServiceImpl(UserMapper userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
    	com.fengxingshifang.dirtychinese.entity.User applicationUser = userDao.findByUserId(userId);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(userId);
        }
        
        Collection<GrantedAuthority> auths = this.loadUserAuthorities(userId);
        
        return new User(applicationUser.getUserid(), applicationUser.getUserpassword(), auths);
//      return new User(applicationUser.getUserid(), applicationUser.getUserpassword(), new ArrayList<>());
    }
    
    protected Collection<GrantedAuthority> loadUserAuthorities(String userId) {
    	
    	List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
    	
    	com.fengxingshifang.dirtychinese.entity.User applicationUser = userDao.findByUserId(userId);
    	GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(applicationUser.getRole()); 
    	auths.add(grantedAuthority); 
        return auths;  
    }
}

