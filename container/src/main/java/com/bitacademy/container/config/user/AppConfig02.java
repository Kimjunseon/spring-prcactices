package com.bitacademy.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bitacademy.container.user.User01;

@Configuration // 달지않으면 DI가 안됌
public class AppConfig02 {
	
	@Bean
	public User01 user01() {
		return new User01();
	}
}
