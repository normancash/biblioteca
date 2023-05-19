package com.uam.biblioteca.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name="Book")
public class Book extends Publicacion{

    private int pages;
}
