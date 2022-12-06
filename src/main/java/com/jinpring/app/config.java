package com.jinpring.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer { // web에서의 MVC 동작에 관한 설정 인터페이스

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		  registry.addMapping("/**").allowedOrigins("*"); // 모든 페이지에 대해.모든 Origin 허용
	}
}
