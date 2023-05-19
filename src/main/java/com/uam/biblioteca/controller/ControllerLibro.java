package com.uam.biblioteca.controller;

import com.uam.biblioteca.model.Libro;
import com.uam.biblioteca.service.IServiceLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class ControllerLibro {
    @Autowired
    private IServiceLibro service;

    @GetMapping("/all")
    public List<Libro> getAll() {
         return service.getAll();
    }

    @PostMapping(value = "/save")
    public Libro saveLibro(@RequestBody Libro libro) {
       return service.save(libro);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Libro> updateLibro(@RequestBody Libro libro) throws Exception {
        if (libro.getId() == null) {
            throw new Exception("Please, send the Id value");
        }
        return ResponseEntity.status(HttpStatus.OK).body(service.save(libro)) ;
    }

    @DeleteMapping(value="/delete/{id}")
    public void deleteLibro(@PathVariable Long id) {
        service.deleteById(id);
    }

}
