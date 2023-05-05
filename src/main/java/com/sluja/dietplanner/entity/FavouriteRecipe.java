package com.sluja.dietplanner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favouriteRecipe")
public class FavouriteRecipe {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private Recipe recipe;
}
