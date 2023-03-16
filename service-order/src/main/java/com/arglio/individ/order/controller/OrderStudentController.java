package com.arglio.individ.order.controller;

import com.arglio.individ.core.pojo.Entity.Student;
import com.arglio.individ.order.client.OrderToCoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor soft
 * 2023/3/12
 */
@RestController
@RequestMapping("/order")
public class OrderStudentController {
    @Autowired
    private OrderToCoreClient orderToCoreClient;

    @GetMapping("/core/getList")
    public List<Student> getList(){
        List<Student> list = orderToCoreClient.getList();
        return list;
    }
}
