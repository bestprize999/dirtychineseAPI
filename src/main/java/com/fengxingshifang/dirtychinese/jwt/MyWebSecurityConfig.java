package com.fengxingshifang.dirtychinese.jwt;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fengxingshifang.dirtychinese.dao.UserMapper;

@Configuration
@Order(SecurityProperties.DEFAULT_FILTER_ORDER)
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
    private UserDetailsService userDetailsService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	UserMapper userDao;
    
    private static final String DEF_USERS_BY_USERNAME_QUERY = "select userid,userpassword,userstatus as enabled from user where userid = ?";
    private static final String DEF_AUTHORITIES_BY_USERNAME_QUERY = "select userid, role as authority from user where userid = ?";
//    private static final String DEF_GROUP_AUTHORITIES_BY_USERNAME_QUERY = "select g.role_id, g.role_name, gat.authority_name "
//            + "from sys_role g, sys_user_role gm, sys_role_authority ga ,sys_authority gat,sys_user u" + " where "
//            + "u.username =?" + " and " + "gm.user_id = u.user_id" + " and " + "g.role_id = ga.role_id" + " and "
//            + "g.role_id = gm.role_id" + " and " + "ga.authority_id = gat.authority_id";

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
    }
    
    
    public MyWebSecurityConfig(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDetailsService = userDetailsService;
//    	this.userDetailsService = new UserDetailsServiceImpl();
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().authorizeRequests()
        		.antMatchers("/**/*.css").permitAll()
        		.antMatchers("/**/*.js").permitAll()
        		.antMatchers("/**/*.png").permitAll()
        		.antMatchers("/**/*.jpg").permitAll()
        		.antMatchers("/**/*.jpeg").permitAll()
        		.antMatchers("/**/*.gif").permitAll()
        		.antMatchers("/**/*.ico").permitAll()
        		.antMatchers("/**/*.json").permitAll()
                .antMatchers(HttpMethod.POST, "/users/signup").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers(HttpMethod.GET, "/listUser").permitAll()
//                .antMatchers(HttpMethod.GET, "/listInfo").permitAll()
                .antMatchers(HttpMethod.GET, "/findByUserId").permitAll()
                .antMatchers(HttpMethod.POST, "/signup").permitAll()
//                .antMatchers(HttpMethod.GET, "/listInfo").authenticated()
//                .antMatchers(HttpMethod.GET, "/listInfo").hasAuthority("1")//.access("hasAuthority('ROLE_USER')")
//              .antMatchers(HttpMethod.GET, "/listInfo").hasRole("1")//.access("hasRole('ROLE_1')")
                .antMatchers(HttpMethod.GET, "/listInfo").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfolisthome").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfolistmypublish").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfolistmycollect").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfolistmyview").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfo").permitAll()
                .antMatchers(HttpMethod.GET, "/getinfocomment").permitAll()
                .antMatchers(HttpMethod.GET, "/admin/index").permitAll()
                .antMatchers(HttpMethod.POST, "/uploadFile").permitAll()
                .antMatchers(HttpMethod.POST, "/addinfo").permitAll()
//                .anyRequest().authenticated()
                .anyRequest().permitAll()
//                .and()
//                .addFilter(new JWTLoginFilter(authenticationManager(), userDao))
//                .addFilter(new JwtAuthenticationFilter(authenticationManager(), userDao))
                ;
    }

    @Autowired
    private DataSource dataSource;


    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);

//        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(DEF_USERS_BY_USERNAME_QUERY)
//        .authoritiesByUsernameQuery(DEF_AUTHORITIES_BY_USERNAME_QUERY);
//        .groupAuthoritiesByUsername(DEF_GROUP_AUTHORITIES_BY_USERNAME_QUERY).rolePrefix("");

        
        
//        auth.jdbcAuthentication().dataSource(dataSource)
//        .usersByUsernameQuery("select userid,userpassword,userstatus "
//                +"from user where userid=?")
//        .authoritiesByUsernameQuery("select userid, role "
//                +"from user where userid=?");

    }

    

}
