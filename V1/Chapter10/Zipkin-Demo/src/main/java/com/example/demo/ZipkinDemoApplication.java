package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinDemoApplication {

    //https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.12.9/
    // 下载可执行文件 zipkin-server-2.12.9-exec.jar
    public static void main(String[] args) {
        SpringApplication.run(ZipkinDemoApplication.class, args);
    }


}
