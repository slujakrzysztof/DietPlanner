package com.sluja.dietplanner.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class IngredientDTO {

    private String name;
    private String amount;
}
