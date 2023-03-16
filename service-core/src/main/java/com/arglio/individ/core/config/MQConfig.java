package com.arglio.individ.core.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @autor soft
 * 2023/3/16
 */
public class MQConfig implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @PostConstruct
    public void a(){
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback(this);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        System.out.println(b);
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }
}
