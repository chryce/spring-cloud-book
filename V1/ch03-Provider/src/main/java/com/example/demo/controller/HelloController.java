package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hurui
 */
@RestController
public class HelloController {

    @Value("${provider.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String sayHello() {
        String str = "provider:" + name + " port:" + port;
        return str;
    }
}
