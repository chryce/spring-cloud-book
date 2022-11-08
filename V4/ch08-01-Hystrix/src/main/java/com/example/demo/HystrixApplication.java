package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
 @SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}

}
