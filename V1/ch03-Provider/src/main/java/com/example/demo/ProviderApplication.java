package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hurui
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    // java -jar ch03-Provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider1
    // java -jar ch03-Provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider2
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}


