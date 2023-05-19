package com.uam.biblioteca.repository;

import com.uam.biblioteca.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryUser extends JpaRepository<Users,Long> {

    @Query("select e from Users e where e.name = :user and e.password = :password")
    public Users getUserByUser(@Param("user") String user, @Param("password") String password);


}
