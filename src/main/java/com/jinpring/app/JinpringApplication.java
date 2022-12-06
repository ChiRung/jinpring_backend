package com.jinpring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // entity createDate, lastModifiedDate 쓰기위해 만들어 놓았음
@SpringBootApplication
public class JinpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JinpringApplication.class, args);
	}

}
