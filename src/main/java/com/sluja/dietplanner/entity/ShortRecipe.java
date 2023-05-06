package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.CookingTime;
import com.sluja.dietplanner.enums.PreparingLevel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "shortRecipe")
@Getter
public class ShortRecipe {

    @Id
    @Column
    private int id;

    @ManyToOne
    @JoinColumn(name = "cuisine_type_id")
    private CuisineType cuisineType;

    @Column
    private PreparingLevel preparingLevel;

    @Column
    private CookingTime cookingTime;

    @Column
    private String name;

    @JoinColumn(name = "recipe_id")
    @OneToOne
    private Recipe recipe;

    @Column
    private boolean favourite;
}
