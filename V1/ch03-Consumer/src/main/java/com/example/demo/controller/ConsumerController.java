package com.example.demo.controller;

import com.example.demo.service.HelloClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hurui
 */
@RestController
public class ConsumerController {

    private HelloClient helloClient;

    public ConsumerController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @RequestMapping("/serverInfo")
    public String index() {
        return helloClient.serverInfo();
    }
}