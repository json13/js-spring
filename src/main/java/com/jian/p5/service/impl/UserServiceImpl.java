package com.jian.p5.service.impl;

import com.jian.p5.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "Hello World";
    }
}
