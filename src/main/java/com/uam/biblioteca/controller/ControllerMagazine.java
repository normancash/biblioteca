package com.uam.biblioteca.controller;

import com.uam.biblioteca.dto.MagazineDto;
import com.uam.biblioteca.model.Magazine;
import com.uam.biblioteca.service.IServiceMagazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/magazine")
public class ControllerMagazine {

    @Autowired
    private IServiceMagazine serviceMagazine;

    @PostMapping("/save")
    public Magazine save(@RequestBody MagazineDto magazineDto) {
        return serviceMagazine.save(magazineDto);
    }
}
