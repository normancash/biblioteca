package com.uam.biblioteca.model;


import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class Publicacion {
    @Id
    @SequenceGenerator(name="pub_seq",sequenceName = "pub_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pub_seq")
    protected Long id;

    @Column
    protected String title;

}
