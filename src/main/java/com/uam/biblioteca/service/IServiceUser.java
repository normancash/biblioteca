package com.uam.biblioteca.service;

import com.uam.biblioteca.dto.LoginResponse;
import com.uam.biblioteca.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface IServiceUser {

    LoginResponse getUser(String user, String password);

    Users createUser(Users user);
}
