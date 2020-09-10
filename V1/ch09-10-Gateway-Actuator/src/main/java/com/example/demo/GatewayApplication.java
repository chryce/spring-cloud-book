package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	/**
	 * 查询已注册的路由：Method:Post
	 * http://localhost:9010/actuator/gateway/routes
	 *
	 * 刷新路由信息，Method：Post
	 * http://localhost:9010/actuator/gateway/refresh
	 *
	 * 动态添加路由：
	 *  http://localhost:9010/actuator/gateway/routes/hello2
	 *
	 *  {
	 *     "id": "hello2",
	 *     "predicates": [
	 *         {
	 *             "name": "Path",
	 *             "args": {
	 *                 "_genkey_0": "/book/**"
	 *             }
	 *         }
	 *     ],
	 *     "filters": [],
	 *     "uri": "http://localhost:9102/",
	 *     "order": 0
	 * }
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
