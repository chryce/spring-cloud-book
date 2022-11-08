package com.example.demo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "producer", configuration = RibbonClientConfiguration.class)
public class RibbonConfig {
    /*   @Bean
       public IRule iRule (IClientConfig iClientConfig)
       {
           ZoneAvoidanceRule zoneAvoidanceRule=new ZoneAvoidanceRule();
           zoneAvoidanceRule.initWithNiwsConfig(iClientConfig);
           return zoneAvoidanceRule;
       }*/
    /*
     *  BenaType:IRule
     * BenaName:iRule
     * ClassNanme:ZoneAvoidanceRule
     *
     * */
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
