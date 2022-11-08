package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	/**
	* 代码方式实现转发
	*/
	@Bean
	public RouteLocator routeLocator (RouteLocatorBuilder builder) {
		return builder.routes()
				.route("archives", r -> r.path("/archives/**")
						.uri("https://fairy.vip/archives/"))
				//http://localhost:8221/archives/2021==>https://fairy.vip/archives/2021/
				.build();
	}

}
