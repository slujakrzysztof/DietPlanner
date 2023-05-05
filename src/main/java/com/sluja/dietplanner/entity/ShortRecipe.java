package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.CookingTime;
import com.sluja.dietplanner.enums.PreparingLevel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shortRecipe")
public class ShortRecipe {

    @Id
    @Column
    private int id;

    @Column
    private CuisineType cuisineType;

    @Column
    private PreparingLevel preparingLevel;

    @Column
    private CookingTime cookingTime;

    @Column
    private String name;

    @Column
    private Recipe recipe;

    @Column
    private boolean favourite;
}
