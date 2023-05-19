package com.uam.biblioteca.controller;

import com.uam.biblioteca.model.Editorial;
import com.uam.biblioteca.service.IServiceEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editorial")
public class ControllerEditorial {

    @Autowired
    private IServiceEditorial service;

    @GetMapping("/all")
    public List<Editorial> getAll() {
         return service.getAll();
    }
    @PostMapping("/save")
    public Editorial save(@RequestBody Editorial editorial) {
         return service.save(editorial);
    }

    @GetMapping("/test")
    public String getTest() {
        return "Test";
    }
}
