package com.bro.cloud;

import com.bro.cloud.component.RabbitMqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BroCloudProviderApplicationTests {
    @Autowired
    private RabbitMqSender rabbitMqSender;

    @Test
    public void test() {
        rabbitMqSender.send("send success!");
    }
}
