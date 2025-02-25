package com.bit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.entity.UserEntity;
import com.bit.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

// UserEntity findById(Long id);
//     UserEntity createUserEntity(UserEntity userEntity);
//     List<UserEntity> findByUserName(String userName);
//     List<UserEntity> findByUserNameStartWith(String userName);
//     UserEntity findByUserNameAndFullName(String userName, String fullName321123);
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/v1")
    public UserEntity getUserInfo(){
        return userService.findById(1l);
    }

    @GetMapping("{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }
    
    @GetMapping
    public List<UserEntity> getUserByName(@RequestParam String fullName) {
        return userService.findByFullNameStartWith(fullName);
    }
    
}
