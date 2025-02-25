package com.bit.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.entity.UserEntity;
@Service
public interface UserService {
    List<UserEntity> getAll();
    UserEntity findById(Long id);
    UserEntity createUserEntity(UserEntity userEntity);
    List<UserEntity> findByUserName(String userName);
    List<UserEntity> findByFullNameStartWith(String fullName);
    UserEntity findByUserNameAndFullName(String userName, String fullName321123);
}