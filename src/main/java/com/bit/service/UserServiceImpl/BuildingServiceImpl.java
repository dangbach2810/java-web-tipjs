package com.bit.service.UserServiceImpl;
import com.bit.service.BuildingService;
import com.bit.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;
import com.bit.repository.BuildingRepository;
import com.bit.dto.BuildingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired   
    private BuildingRepository buildingRepository;

    @Override
    @Transactional
    public BuildingEntity createBuilding(BuildingEntity buildingEntity) {
        return buildingRepository.save(buildingEntity);
    }


    @Override
    public List<BuildingDTO> getAll() {
        List<BuildingEntity> buildingEntities = buildingRepository.findAll();
        List<BuildingDTO> buildingDTOs = new ArrayList<>();
        for(BuildingEntity buildingEntity : buildingEntities) {
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setName(buildingEntity.getName());
            buildingDTOs.add(buildingDTO);
        }
        return buildingDTOs;
    }
}
