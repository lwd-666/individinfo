package com.arglio.individ.order.client.config;

import com.arglio.individ.core.pojo.Entity.Student;
import com.arglio.individ.order.client.OrderToCoreClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @autor soft
 * 2023/3/13
 */
@Component
public class FollbackCore implements OrderToCoreClient {
    @Override
    public List<Student> getList() {
        return null;
    }
}
