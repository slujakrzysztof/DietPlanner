package com.sluja.dietplanner.builder;

import com.sluja.dietplanner.dtos.ShortRecipeDTO;
import com.sluja.dietplanner.entity.ShortRecipe;

import java.util.function.Function;

public class ShortRecipeBuilder implements Function<ShortRecipe, ShortRecipeDTO> {
    @Override
    public ShortRecipeDTO apply(ShortRecipe shortRecipe) {

        return ShortRecipeDTO.builder()
                             .name(shortRecipe.getName())
                             .favourite(shortRecipe.getRecipe().isFavourite())
                             .preparingLevel(shortRecipe.getPreparingLevel())
                             .category(shortRecipe.getRecipe().getCategory())
                             .build();
    }
}
