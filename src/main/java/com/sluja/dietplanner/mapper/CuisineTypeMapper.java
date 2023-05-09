package com.sluja.dietplanner.mapper;

import com.sluja.dietplanner.dtos.CuisineTypeDTO;
import com.sluja.dietplanner.entity.CuisineType;

public class CuisineTypeMapper {

    public static CuisineTypeDTO mapToCuisineTypeDTO(CuisineType cuisineType) {

        return CuisineTypeDTO.builder()
                             .name(cuisineType.getName())
                             .build();
    }
}
