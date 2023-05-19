package com.uam.biblioteca.controller;


import com.uam.biblioteca.model.Book;
import com.uam.biblioteca.service.IServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class ControllerBook {

    @Autowired
    private IServiceBook serviceBook;

   @PostMapping("/save")
   public Book save(@RequestBody Book book) {
       return serviceBook.save(book);
   }
}
