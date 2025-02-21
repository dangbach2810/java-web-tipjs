package com.bit.repository;
import org.springframework.stereotype.Repository;

import com.bit.entity.UserEntity;
@Repository
public interface UserRepository {
    UserEntity findById(Long id);
}
