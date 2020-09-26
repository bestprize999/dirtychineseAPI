package com.fengxingshifang.dirtychinese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengxingshifang.dirtychinese.dao.InfoMapper;
import com.fengxingshifang.dirtychinese.dao.UserMapper;
import com.fengxingshifang.dirtychinese.entity.Info;
import com.fengxingshifang.dirtychinese.entity.User;

@RestController
@EnableAutoConfiguration
public class UserController {
//    private AuthenticationManager authenticationManager;
//    private UserDetailsService userDetailsService;
//    private JwtTokenUtil jwtTokenUtil;

//    private UserMapper userDao;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    public UserController(UserMapper userDao,
//                          BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.userDao = userDao;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }

    public UserController(BCryptPasswordEncoder bCryptPasswordEncoder) {
//this.userDao = userDao;
this.bCryptPasswordEncoder = bCryptPasswordEncoder;
}

    @Autowired
	UserMapper userDao;
	
	@GetMapping("/listUser")
    public User home() {
//        return "Hello World!";
//		return null;
		return userDao.findByUserId("111111");

    }

//	@PostMapping("/login")
//    public List<Info> login() {
//
//		UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
//        final Authentication authentication = authenticationManager.authenticate(upToken);
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//        final String token = jwtTokenUtil.generateToken(userDetails);
//        return token;
//
//		return null;
//    }

	@GetMapping("/findByUserId")
    public User findByUserId(@RequestParam(value="userId",required=true) String userId) {
//        return "Hello World!";
		return userDao.findByUserId(userId);
    }

    @PostMapping("/signup")
    public void signUp(@RequestBody User user) {
        user.setUserpassword(bCryptPasswordEncoder.encode(user.getUserpassword()));
        userDao.save(user);
    }

	
}
