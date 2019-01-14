package com.winter.orderservice.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Config
 *
 * @author Gavin
 * @date 2019/1/14 14:46
 */
@Configuration
public class RestConfig {
    @Bean
    public IRule ribbonRule(){
        return  new RandomRule();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
