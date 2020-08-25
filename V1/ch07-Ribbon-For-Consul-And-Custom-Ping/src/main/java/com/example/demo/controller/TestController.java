package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author hurui
 * 自定义 Ping 測試
 */
@RestController
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-producer");
        String ret = serviceInstance.getHost() + ":" + serviceInstance.getPort() + " " + sdf.format(date);
        System.out.println(ret);
        return ret;
    }


}
