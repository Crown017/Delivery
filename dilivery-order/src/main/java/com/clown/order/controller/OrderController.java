package com.clown.order.controller;

import com.clown.api.member.MemberSerivice;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController  {


    @Reference(interfaceClass = MemberSerivice.class,version = "1.0.0",check = false)
    private MemberSerivice memberSerivice;

    @PostMapping("/getUser")
    public void getUser(Integer userId){
        String userInfo =  memberSerivice.getUserInfoById(userId);
        System.out.println(userInfo);
    }
}
