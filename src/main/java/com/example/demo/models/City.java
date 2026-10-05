package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "cities")
public class City extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres; //OneToMany
}

// City --- Theatre => 1:M

// create table city ..........
