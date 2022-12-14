package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "example-provider")
public interface MyFeignClient {
    @GetMapping(value = "/hello/{str}")
    public String echo(@PathVariable("str") String str);
}
