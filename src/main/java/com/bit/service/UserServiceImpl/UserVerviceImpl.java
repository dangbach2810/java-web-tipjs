package com.bit.service.UserServiceImpl;
import com.bit.entity.UserEntity;
import com.bit.repository.UserRepository;
import com.bit.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserVerviceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
    @Override
    public UserEntity createUserEntity(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
