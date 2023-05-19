package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Editorial;
import com.uam.biblioteca.model.Libro;
import com.uam.biblioteca.repository.IRepositoryEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEditorial implements IServiceEditorial{

    @Autowired
    private IRepositoryEditorial repo;
    @Override
    public List<Editorial> getAll() {
        return repo.findAll();
    }

    @Override
    public Editorial save(Editorial editorial) {
        List<Libro> detalles  = editorial.getDetalles();
        List<Libro> datos = new ArrayList<>();
        Editorial maestro = new Editorial();
        maestro.setDescription(editorial.getDescription());
        maestro.setName(editorial.getName());
        for (Libro libro :detalles) {
            Libro l  = new Libro();
            l.setEditorial(maestro);
            l.setNombre(libro.getNombre());
            datos.add(l);
        }
        maestro.setDetalles(datos);
        return repo.save(maestro);
    }
}
