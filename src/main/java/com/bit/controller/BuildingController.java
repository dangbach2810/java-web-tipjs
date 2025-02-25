package com.bit.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.dto.BuildingDTO;

@RestController
@RequestMapping("api/building")
public class BuildingController {
    @PostMapping
    public ResponseEntity<BuildingDTO> createBuilding(@RequestBody BuildingDTO buildingDTO) {

        return (ResponseEntity<BuildingDTO>) ResponseEntity.ok();
    }
}
