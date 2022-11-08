package com.example.demo.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author: longzhonghua
 * @date: 2019/9/20
 * Description: 调用服务接口
 */
@RestController
public class HelloController {

    private String serviceId = "service-provider";

    private final LoadBalancerClient loadBalancer;
    private final DiscoveryClient discoveryClient;

    public HelloController(LoadBalancerClient loadBalancer, DiscoveryClient discoveryClient) {
        this.loadBalancer = loadBalancer;
        this.discoveryClient = discoveryClient;
    }

    /**
     * 获取所有服务提供者
     * http://localhost:9002/instances-lists
     */
    @GetMapping("/instances-lists")
    public Object instancesLists() {
        return discoveryClient.getInstances(serviceId);
    }

    /**
     * 获取所有注册服务名称
     *  http://localhost:9002/services-lists
     */
    @GetMapping("/services-lists")
    public Object servicesLists() {
        return discoveryClient.getServices();
    }


    /**
     * 从所有服务中选择一个服务（轮询）
     *  http://localhost:9002/poll-service
     */
    @GetMapping("/poll-service")
    public Object pollService() {
        return loadBalancer.choose(serviceId).getUri().toString();
    }

    /**
     * 调用服务提供者接口
     *  http://localhost:9002/hello
     */
    @GetMapping("/hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancer.choose(serviceId);
        URI uri = serviceInstance.getUri();
        String callService = new RestTemplate().getForObject(uri + "/hello", String.class);
        System.out.println(callService);
        return callService;
    }
}
