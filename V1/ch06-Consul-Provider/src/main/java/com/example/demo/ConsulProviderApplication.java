package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//支持服务发现。
@EnableDiscoveryClient
public class ConsulProviderApplication {


    // .\consul.exe agent -dev
    // http://127.0.0.1:8500/ui/dc1/services
    // java -jar .\ch06-Consul-Provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider1
    // java -jar .\ch06-Consul-Provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=provider2
    // java -jar .\ch06-Consul-Provider-0.0.1-SNAPSHOT.jar

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderApplication.class, args);
    }

}
