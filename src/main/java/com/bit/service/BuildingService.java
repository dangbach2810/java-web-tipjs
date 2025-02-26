package com.bit.service;

import com.bit.entity.BuildingEntity;
import com.bit.dto.BuildingDTO;
import java.util.List;
public interface BuildingService {
    BuildingEntity createBuilding(BuildingEntity buildingEntity);
    List<BuildingDTO> getAll();
}
