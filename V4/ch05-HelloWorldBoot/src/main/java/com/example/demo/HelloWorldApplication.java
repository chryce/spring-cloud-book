package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

//    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(HelloWorldApplication.class);
//        springApplication.run();
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
//    }

//    public static void main(String[] args) {
//        new SpringApplicationBuilder().sources(Parent.class).child(HelloWorldApplication.class).run(args);
//    }

}
