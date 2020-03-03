package bro.cloud.component;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName:RabbitMqSender
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/23 13:12
 * @Version:V1.0
 */
@Component
public class RabbitMqSender {

    @Value("${ckhDirectExchange}")
    private String ckhDirectExchange;

    @Value("${ckhDirectQueueRouttingkey}")
    private String ckhDirectQueueRouttingkey;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //发送消息
    public void send(String msg) {
        rabbitTemplate.convertAndSend(ckhDirectExchange, ckhDirectQueueRouttingkey, msg);

    }

}
