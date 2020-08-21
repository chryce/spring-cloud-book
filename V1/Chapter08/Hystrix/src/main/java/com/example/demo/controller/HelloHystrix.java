package com.example.demo.controller;

import com.example.demo.MyFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloHystrix implements MyFeignClient {

    @Override
    public String hello() {
        return "出现错误 ";
    }
}