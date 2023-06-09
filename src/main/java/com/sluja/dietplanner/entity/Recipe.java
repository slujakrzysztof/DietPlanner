package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.enums.CookingTime;
import com.sluja.dietplanner.enums.PreparingLevel;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "recipe")
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "ingredient_id")
    @ManyToMany
    @Nullable
    private List<Ingredient> ingredient;

    @Column
    private CookingTime cookingTime;

    @Column
    @Nullable
    private String description;

    @Column
    @Nullable
    private BigDecimal totalPrice;

    @Column
    private PreparingLevel preparingLevel;

    @ManyToOne
    @JoinColumn(name = "cuisine_type_id")
    private CuisineType cuisineType;

    @Column
    private String instruction;

    @Column
    private String name;

    @Column
    @Nullable
    private String image;

    @Column(name = "category")
    private Category category;

    @Column
    private boolean favourite;


}
