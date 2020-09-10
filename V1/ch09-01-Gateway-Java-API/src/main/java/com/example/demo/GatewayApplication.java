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



    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                /**
                 *    匹配规则：** ：匹配多级
                 *             *： 匹配单级
                 */
                .route("r001", r -> r.path("/hello/**").uri("http://localhost:9102/hello"))
                // http://localhost:9001/hello/       --> http://localhost:9102/hello/
                // http://localhost:9001/hello        --> http://localhost:9102/hello
                // http://localhost:9001/hello/p1/p2  --> http://localhost:9102/hello/p1/p2


                .route("r002", r -> r.path("/hello").uri("http://localhost:9102/hello"))
                // http://localhost:9001/hello         http://localhost:9102/hello


                .route("r003", r -> r.path("/hello/*").uri("http://localhost:9102/hello"))
                // http://localhost:9001/hello/        http://localhost:9102/hello
                // http://localhost:9001/hello/service http://localhost:9102/hello/service
                // http://localhost:9001/hello/test    http://localhost:9102/hello/test


                .route("r004", r -> r.path("/hellos/service").uri("http://localhost:9102/hello/service"))
                // http://localhost:9001/hellos/service ==> http://localhost:9102/hellos/service
                .build();
    }

}
