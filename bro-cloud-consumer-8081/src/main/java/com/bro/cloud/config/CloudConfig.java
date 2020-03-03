package com.bro.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:CloudConfig
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/23 23:45
 * @Version:V1.0
 */
@Configuration
public class CloudConfig {
    // @LoadBalanced 带负载均衡算法   默认是轮询算法
    @LoadBalanced
    //RestTemplate rest风格访问
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //负载均衡算法
    @Bean
    public IRule rule() {
        //轮询算法
        return new RoundRobinRule();
        //随机
//        return new RandomRule();
    }


}
