package com.sluja.dietplanner.dtos;

import com.sluja.dietplanner.entity.CuisineType;
import com.sluja.dietplanner.entity.Ingredient;
import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.enums.CookingTime;
import com.sluja.dietplanner.enums.PreparingLevel;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class RecipeDTO {

    private String name;
    @Nullable
    private String description;
    private List<IngredientDTO> ingredients;
    private String instruction;
    private Category category;
    private CuisineType cuisineType;
    private CookingTime cookingTime;
    private PreparingLevel preparingLevel;
}
