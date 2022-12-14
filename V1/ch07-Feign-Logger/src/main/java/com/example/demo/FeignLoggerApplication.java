package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * * 依赖项目：ch06-Consul-Provider
 * @author hurui
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignLoggerApplication.class, args);
	}

}
