package bro.cloud;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableRabbit
@SpringBootApplication
@EnableEurekaClient
public class BroCloudProviderApplication8082 {

    public static void main(String[] args) {
        SpringApplication.run(BroCloudProviderApplication8082.class, args);
    }

}
