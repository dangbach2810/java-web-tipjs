package com.bit.repository;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bit.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
   // UserEntity findById(Long id);
   List<UserEntity> findByUserName(String userName);
   List<UserEntity> findByFullNameContaining(String fullName);
   UserEntity findByUserNameAndFullName(String userName, String fullName321123);
}
