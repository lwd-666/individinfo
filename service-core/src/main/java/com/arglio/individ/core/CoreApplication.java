package com.arglio.individ.core;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @autor soft
 * 2023/3/12
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.arglio.individ.core","com.arglio.individ.mq"})
public class CoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class,args);
    }
}
