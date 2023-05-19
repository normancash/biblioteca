package com.uam.biblioteca.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class Publication {
    @Id
    @SequenceGenerator(name="pb_seq",sequenceName = "pb_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pb_seq")
    protected Long id;

    @Column(nullable = false,name="TITLE_PUBLICATION")
    protected String title;

}
