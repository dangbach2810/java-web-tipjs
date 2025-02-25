package com.bit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.entity.BuildingEntity;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long> {
}