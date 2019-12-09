package com.clown.member;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MemmberServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemmberServiceApplication.class,args);
    }
}
