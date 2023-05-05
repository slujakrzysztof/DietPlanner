package com.sluja.dietplanner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blacklist")
public class BlackList {

    @Id
    @Column
    private int id;

    @Column
    private Recipe recipe;
}
