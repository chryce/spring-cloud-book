package com.example.demo.controller;


import com.example.demo.HelloProducer;
import org.springframework.stereotype.Component;

@Component
public class HelloProducerHystrix implements HelloProducer {

    @Override
    public String hello() {
        return "出现错误";
    }
}