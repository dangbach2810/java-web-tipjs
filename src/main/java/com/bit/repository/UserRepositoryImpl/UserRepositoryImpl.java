package com.bit.repository.UserRepositoryImpl;

import org.springframework.stereotype.Repository;

import com.bit.entity.UserEntity;
import com.bit.repository.UserRepository;
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Override
    public UserEntity findById(Long id) {
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setUsername("Bang");
        user.setFullName("BigBang");
        return user;
    }
    
}
