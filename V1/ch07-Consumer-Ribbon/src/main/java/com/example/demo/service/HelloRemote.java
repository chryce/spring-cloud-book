package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hurui
 */
@FeignClient(contextId = "eureka-client", name = "eureka-client-1")
//name:远程服务名，及spring.application.name配置的名称
//此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
public interface HelloRemote {

    @RequestMapping(value = "/sayHello")
    public String sayHello(@RequestParam(value = "userName") String userName);
}