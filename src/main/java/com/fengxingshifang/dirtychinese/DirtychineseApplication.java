package com.fengxingshifang.dirtychinese;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fengxingshifang.dirtychinese.entity.Info;
import com.fengxingshifang.dirtychinese.entity.User;
import com.fengxingshifang.dirtychinese.fileupload.FileStorageProperties;
import com.fengxingshifang.dirtychinese.jwt.JWTLoginFilter;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class DirtychineseApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(DirtychineseApplication.class, args);
	}
	

}
