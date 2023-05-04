package com.sluja.dietplanner.entity;

import jakarta.persistence.*;

@Entity
@Table
public class CookingTime {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
}
