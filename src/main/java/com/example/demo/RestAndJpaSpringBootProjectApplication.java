package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAndJpaSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAndJpaSpringBootProjectApplication.class, args);
		System.out.println("Started Rest App");
	}

}
