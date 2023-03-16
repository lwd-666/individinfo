package com.arglio.individ.order.listener;

import com.arglio.individ.mq.pojo.dto.CourseMq;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @autor soft
 * 2023/3/16
 */
@Component
public class MQListener {
    @RabbitListener(bindings = @QueueBinding(
            value =@Queue(value = "queue.test",durable = "true"),
            exchange = @Exchange(value = "exchange.test",durable = "true"),
            key = {"routing.test"}
    ))
    public void a(Channel channel, Message message, CourseMq courseMq) throws IOException {
        byte[] messageBody = message.getBody();
        String s = new String(messageBody);
        System.out.println(s);
        channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
    }
}
