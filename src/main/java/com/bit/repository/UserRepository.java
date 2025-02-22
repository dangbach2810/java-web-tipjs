package com.bit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bit.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
   // UserEntity findById(Long id);
}
