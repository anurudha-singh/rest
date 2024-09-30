package com.hvt.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<User> extends JpaRepository<User, Integer>{
    // public void getUser();
    // public void createUser();
    // public void updateUser();
    // public void deleteUser();
}

 