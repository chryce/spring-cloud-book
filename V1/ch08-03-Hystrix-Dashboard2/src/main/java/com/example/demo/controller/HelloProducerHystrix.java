package com.example.demo.controller;

import com.example.demo.HelloProducerTwo;
import org.springframework.stereotype.Component;

@Component
public class HelloProducerHystrix implements HelloProducerTwo {

    @Override
    public String hello() {
        return "出现错误";
    }
}