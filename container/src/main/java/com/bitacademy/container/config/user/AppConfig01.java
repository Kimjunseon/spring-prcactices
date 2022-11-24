package com.bitacademy.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bitacademy.container.user.User;

@Configuration // 달지않으면 DI가 안됌
public class AppConfig01 {
	
	@Bean
	public User user() {
		return new User();
	}
}
