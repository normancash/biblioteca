package com.uam.biblioteca.model;


import lombok.Data;

import javax.persistence.Entity;

@Entity(name="Blog")
@Data
public class Blog extends Publicacion{

    private String url;
}
