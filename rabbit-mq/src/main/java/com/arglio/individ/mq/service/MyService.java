package com.arglio.individ.mq.service;

import com.arglio.individ.mq.pojo.dto.CourseMq;

public interface MyService {
    public void sendCourse(String exchange, String routing, CourseMq courseMq);
}
