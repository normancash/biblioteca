package com.uam.biblioteca.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Users {

    @Id
    @SequenceGenerator(name = "usuario_seq",
            sequenceName = "usuario_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "usuario_seq")
    private Long id;


    private String name;


    private String password;

}
