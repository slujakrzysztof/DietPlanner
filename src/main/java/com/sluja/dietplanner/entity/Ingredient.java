package com.sluja.dietplanner.entity;

import com.sluja.dietplanner.enums.Ingredients;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private Ingredients name;

    @Column(name = "price")
    private BigDecimal price;
}
