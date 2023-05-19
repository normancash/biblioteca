package com.uam.biblioteca.service;

import com.uam.biblioteca.dto.MagazineDto;
import com.uam.biblioteca.model.Magazine;
import org.springframework.stereotype.Service;

@Service
public interface IServiceMagazine {

    public Magazine save(MagazineDto magazineDto);
}
