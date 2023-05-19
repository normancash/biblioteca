package com.uam.biblioteca.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Article extends Publication {

    private String nameMagazine;
}
