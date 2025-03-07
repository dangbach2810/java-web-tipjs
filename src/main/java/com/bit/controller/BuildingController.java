package com.bit.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.dto.BuildingDTO;
import com.bit.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bit.entity.BuildingEntity;
import com.bit.entity.RentAreaEntity;
import java.util.*;
//
//@RestController
//@RequestMapping("api/building")
public class BuildingController {

//    @Autowired
    private BuildingService buildingService;
    @PostMapping
    public String createBuilding(@RequestBody BuildingDTO buildingDTO) {
        BuildingEntity buildingEntity = new BuildingEntity();
        List<RentAreaEntity> rentAreaEntities = new ArrayList<>();
        for(Integer rentArea : buildingDTO.getRentAreas()) {
            RentAreaEntity rentAreaEntity = new RentAreaEntity();
            rentAreaEntity.setValue(rentArea);
            rentAreaEntity.setBuilding(buildingEntity);
            rentAreaEntities.add(rentAreaEntity);
        }
        buildingEntity.setName(buildingDTO.getName());
        buildingEntity.setRentAreaEntitys(rentAreaEntities);
        buildingService.createBuilding(buildingEntity);
        return "Success";
    }

    @GetMapping
    public ResponseEntity<List<BuildingDTO>> getAll() {
        return (ResponseEntity<List<BuildingDTO>>) ResponseEntity.ok(buildingService.getAll());
    }
}
