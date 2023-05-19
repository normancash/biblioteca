package com.uam.biblioteca.repository;

import com.uam.biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoyBook extends JpaRepository<Book,Long> {
}
