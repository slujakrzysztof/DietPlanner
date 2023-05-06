package com.sluja.dietplanner.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blacklist")
public class BlackList {

    @Id
    @Column
    private int id;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
}
