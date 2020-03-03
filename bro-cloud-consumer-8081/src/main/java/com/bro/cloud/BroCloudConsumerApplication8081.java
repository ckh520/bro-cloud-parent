package com.bro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BroCloudConsumerApplication8081 {

    public static void main(String[] args) {
        SpringApplication.run(BroCloudConsumerApplication8081.class, args);
    }

}
