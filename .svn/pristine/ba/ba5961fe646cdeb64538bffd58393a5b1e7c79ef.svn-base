package com.minyin.byc.driver_provider.service;

import com.minyin.byc.driver_provider.bean.User;
import com.minyin.byc.driver_provider.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

    @Autowired
    private HelloMapper dao;

    public User selectUser(Integer user_id){
        User user = dao.selectById(user_id);
        return  user;
    }
}
