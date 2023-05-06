package com.sluja.dietplanner.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favouriteRecipe")
public class FavouriteRecipe {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
}
