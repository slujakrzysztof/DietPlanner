package com.sluja.dietplanner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private boolean online;

}
