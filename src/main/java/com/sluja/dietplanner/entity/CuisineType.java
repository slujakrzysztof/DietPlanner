package com.sluja.dietplanner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "cuisineType")
@Getter
public class CuisineType {

    @Id
    @Column
    private int id;

    @Column
    private String name;

}
