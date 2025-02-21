package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.entity.UserEntity;
import com.bit.service.UserService;

@Controller
@RequestMapping("v1/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    @ResponseBody public UserEntity getUserInfo(){
        return userService.findById(123L);
    }
}
