package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.PreparingLevel;
import com.sluja.dietplanner.enums.CuisineType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @ManyToMany
    private List<Ingredient> ingredient;

    @Column
    @ManyToOne
    private CookingTime cookingTime;

    @Column
    private String description;

    @Column
    private BigDecimal totalPrice;

    @Column
    private PreparingLevel preparingLevel;

    @Column
    private CuisineType cuisineType;

    @Column
    private Long kcal;

}
