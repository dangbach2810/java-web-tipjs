package com.bit.dto;

import java.util.List;

import lombok.Data;

@Data
public class BuildingDTO {
    private String name;
    private List<Integer> rentAreas;
}