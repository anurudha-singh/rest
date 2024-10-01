package com.hvt.rest.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService   {
      public void getAllUsers();
    public void createUser();
    public void updateUser();
    public void deleteUser();
}
