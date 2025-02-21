package com.bit.service;
import org.springframework.stereotype.Service;

import com.bit.entity.UserEntity;
@Service
public interface UserService {
    UserEntity findById(Long id);    
}