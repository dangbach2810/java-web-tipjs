package com.bit.service.UserServiceImpl;
import com.bit.entity.UserEntity;
import com.bit.repository.UserRepository;
import com.bit.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
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
    @Override
    public UserEntity findById(Long id) {
       return userRepository.findById(id).get();
    }
    @Override
    public List<UserEntity> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
    @Override
    public List<UserEntity> findByFullNameStartWith(String fullName) {
        return userRepository.findByFullNameContaining(fullName);
    }
    @Override
    public UserEntity findByUserNameAndFullName(String userName, String fullName321123) {
        return userRepository.findByUserNameAndFullName(userName, fullName321123);
    }
}
