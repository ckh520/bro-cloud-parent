package com.bro.cloud;

import com.bro.cloud.component.RabbitMqReceive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BroCloudConsumerApplicationTests {
    @Autowired
    private RabbitMqReceive rabbitMqReceive;
    @Value("${ckhDirectQueue}")
    private String ckhDirectQueue;

    @Test
    public void test() {

        Object o = rabbitMqReceive.receive(ckhDirectQueue);
        System.out.println(o);

    }
}
