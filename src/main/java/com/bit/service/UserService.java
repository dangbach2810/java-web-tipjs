package com.bit.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.entity.UserEntity;
@Service
public interface UserService {
    List<UserEntity> getAll();
    UserEntity createUserEntity(UserEntity userEntity);
}