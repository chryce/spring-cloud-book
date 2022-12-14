package com.example.demo.custom;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import org.springframework.stereotype.Component;

@Component
public class MyCustomPing implements IPing {

    /**
     * 自定义策略
     *
     * @param server
     * @return
     */
    @Override
    public boolean isAlive(Server server) {
        System.out.println("这是自定义 Ping 实现类：" + server.getHostPort());
        return true;
    }

}
