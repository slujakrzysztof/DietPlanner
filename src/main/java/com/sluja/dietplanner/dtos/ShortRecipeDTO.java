package com.sluja.dietplanner.dtos;

import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.enums.PreparingLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ShortRecipeDTO {

    private String name;

    private boolean favourite;

    private PreparingLevel preparingLevel;

    private Category category;
}
