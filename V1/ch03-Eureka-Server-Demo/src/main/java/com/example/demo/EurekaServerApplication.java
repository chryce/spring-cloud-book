package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    //127.0.0.1 node1
    //127.0.0.1 node2
    //127.0.0.1 node3

    //java -jar .\ch03-Eureka-Server-Demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=node1
    //java -jar .\ch03-Eureka-Server-Demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=node2
    //java -jar .\ch03-Eureka-Server-Demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=node3
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
