package com.uam.biblioteca.service;

import com.uam.biblioteca.dto.MagazineDto;
import com.uam.biblioteca.model.Magazine;
import com.uam.biblioteca.repository.IRepositoryMagazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMagazine implements IServiceMagazine{

    @Autowired
    private IRepositoryMagazine repositoryMagazine;

    @Override
    public Magazine save(MagazineDto magazineDto) {
        Magazine m = new Magazine();
        m.setEdicion(magazineDto.getEdicion());
        m.setTitle(magazineDto.getTitulo());
        return repositoryMagazine.save(m);
    }
}
