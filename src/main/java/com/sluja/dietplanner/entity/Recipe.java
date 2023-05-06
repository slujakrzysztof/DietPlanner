package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.enums.CookingTime;
import com.sluja.dietplanner.enums.PreparingLevel;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "recipe")
@Getter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "ingredient_id")
    @ManyToMany
    private List<Ingredient> ingredient;

    @Column
    private CookingTime cookingTime;

    @Column
    private String description;

    @Column
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
    private String image;

    @Column(name = "category")
    private Category category;


}
