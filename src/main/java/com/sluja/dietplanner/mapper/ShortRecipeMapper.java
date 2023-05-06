package com.sluja.dietplanner.mapper;

import com.sluja.dietplanner.builder.ShortRecipeBuilder;
import com.sluja.dietplanner.dtos.ShortRecipeDTO;
import com.sluja.dietplanner.entity.ShortRecipe;

public class ShortRecipeMapper {

    public static ShortRecipeDTO mapToShortRecipeDTO(ShortRecipe shortRecipe) {

        return new ShortRecipeBuilder().apply(shortRecipe);
    }
}
