package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Book;
import org.springframework.stereotype.Service;

@Service
public interface IServiceBook {

    Book save(Book book);
}
