package com.uam.biblioteca.repository;

import com.uam.biblioteca.model.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryMagazine extends JpaRepository<Magazine,Long> {


}
