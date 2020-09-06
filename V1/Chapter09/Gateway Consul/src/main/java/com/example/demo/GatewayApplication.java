package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//支持服务发现。
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    // 服务转发
    // 依赖于 ch06-Consul-Provider
    // http://localhost:8221/service-provider/hello
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /**
     * 代码方式实现转发
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("hello2", r -> r.path("/hello2/**")
                        .uri("http://www.longzhonghua.com"))
                //注意这里是转发到http://www.longzhonghua.com/hello2/**
                .build();
    }

}
