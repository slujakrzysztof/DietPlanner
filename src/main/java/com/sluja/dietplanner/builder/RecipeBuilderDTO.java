package com.sluja.dietplanner.builder;


import com.sluja.dietplanner.dtos.RecipeDTO;

public class RecipeBuilderDTO {

    public static RecipeDTO buildEmptyObject() {

        return RecipeDTO.builder()
                .name("")
                .ingredients(null)
                .instruction("")
                .category(null)
                .cuisineType(null)
                .cookingTime(null)
                .preparingLevel(null)
                .build();
    }
}
