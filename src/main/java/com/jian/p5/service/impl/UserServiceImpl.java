package com.jian.p5.service.impl;

import com.jian.p5.mapper.UserMapper;
import com.jian.p5.pojo.UserVO;
import com.jian.p5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String say() {
        return "Hello World";
    }

    @Override
    public List<UserVO> queryList() {
        List<UserVO> ret = userMapper.query();
        System.out.println("=========="+ret);
        return ret;
    }
}
