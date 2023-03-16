package com.arglio.individ.mq.service.impl;

import com.arglio.individ.mq.pojo.dto.CourseMq;
import com.arglio.individ.mq.service.MyService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autor soft
 * 2023/3/16
 */
@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Override
    public void sendCourse(String exchange, String routing, CourseMq courseMq) {
        rabbitTemplate.convertAndSend(exchange,routing,courseMq);
    }
}
