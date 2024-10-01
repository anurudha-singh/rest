package com.hvt.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hvt.rest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    // public void getUser();
    // public void createUser();
    // public void updateUser();
    // public void deleteUser();
}

 