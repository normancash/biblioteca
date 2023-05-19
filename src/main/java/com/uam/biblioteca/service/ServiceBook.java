package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Book;
import com.uam.biblioteca.repository.IRepositoyBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBook implements IServiceBook{

    @Autowired
    private IRepositoyBook repositoryBook;


    @Override
    public Book save(Book book) {
        repositoryBook.save(book);
        return null;
    }
}
