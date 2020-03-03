package bro.cloud.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:MyRbbitMqConfig
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/23 12:46
 * @Version:V1.0
 */
@Configuration
public class MyRbbitMqConfig {

    @Value("${ckhDirectExchange}")
    private String ckhDirectExchange;
    @Value("${ckhDirectQueue}")
    private String ckhDirectQueue;
    @Value("${ckhDirectQueueRouttingkey}")
    private String ckhDirectQueueRouttingkey;

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(ckhDirectExchange);
    }

    @Bean
    public Queue queue() {
        return new Queue(ckhDirectQueue);
    }

    @Bean
    public Binding binding(@Qualifier("exchange") DirectExchange exchange,
                           @Qualifier("queue") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with(ckhDirectQueueRouttingkey);

    }


}
