package com.uam.biblioteca.controller;


import com.uam.biblioteca.dto.LoginResponse;
import com.uam.biblioteca.model.Users;
import com.uam.biblioteca.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("192.*.*.*")
public class ControllerUser {

    @Autowired
    private IServiceUser serviceUser;

    @PostMapping("/login")
    public LoginResponse getLogin(@Param("name") String name,  @Param("password") String password) {
        System.out.println(name);
        System.out.println(password);
        return serviceUser.getUser(name, password);
    }

    @PostMapping("/save")
    public Users saveUser(Users users) {
        return serviceUser.createUser(users);
    }

}
