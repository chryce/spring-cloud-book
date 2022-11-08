package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
/*	*//**
	 * @LoadBalanced注解，表示开启客户端负载均衡
	 *//*
	@LoadBalanced

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
}
