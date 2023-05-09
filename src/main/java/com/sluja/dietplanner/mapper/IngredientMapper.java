package com.sluja.dietplanner.mapper;

import com.sluja.dietplanner.dtos.IngredientDTO;
import com.sluja.dietplanner.entity.Ingredient;

public class IngredientMapper {

    public static IngredientDTO mapToIngredientDTO(Ingredient ingredient) {

        return IngredientDTO.builder()
                            .name(ingredient.getName())
                            .amount(ingredient.getAmount())
                            .build();
    }
}
