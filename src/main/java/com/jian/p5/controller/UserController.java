package com.jian.p5.controller;

import com.jian.p5.pojo.UserVO;
import com.jian.p5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello() {
        return userService.say();
    }

    @RequestMapping("/queryList")
    @ResponseBody
    public String queryList() {
        return  userService.queryList().get(0).toString();
    }

}
