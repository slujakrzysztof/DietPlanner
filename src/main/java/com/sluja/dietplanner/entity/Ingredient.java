package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.Category;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "category")
    private Category category;

    @JoinColumn(name = "recipe_id")
    @ManyToMany
    private List<Recipe> recipe;
}
