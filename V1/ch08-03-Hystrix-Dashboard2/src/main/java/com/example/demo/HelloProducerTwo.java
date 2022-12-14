package com.example.demo;

import com.example.demo.controller.HelloProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: longzhonghua
 * @date: 2019/9/20
 * 添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
 * name:远程服务名，即spring.application.name配置的名称
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
 */
@Primary
@FeignClient(name = "service-provider", fallback = HelloProducerHystrix.class)
public interface HelloProducerTwo {
    @RequestMapping(value = "/hello")
    public String hello();

}