package com.clown.member.service.impl;

import com.clown.api.member.MemberSerivice;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = MemberSerivice.class,timeout = 10000,version = "1.0.0")
public class MemberServiceImpl implements MemberSerivice {

    @Override
    public String getUserInfoById(Integer userId) {
        String msg = "user Id is"+ userId ;
        return  msg;
    }
}
