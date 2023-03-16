package com.arglio.individ.order.client;

import com.arglio.individ.core.pojo.Entity.Student;
import com.arglio.individ.order.client.config.FollbackCore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @autor soft
 * 2023/3/13
 */
@FeignClient(value = "service-core",fallback = FollbackCore.class)
public interface OrderToCoreClient {
    @GetMapping("/core/student/getList")
    public List<Student> getList();
}
