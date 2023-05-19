package com.uam.biblioteca.dto;

import lombok.Data;

@Data
public class MagazineDto {
    private Long id;
    private String titulo;
    private String nombreRevista;
    private String edicion;
    private Integer idEditorial;
}
