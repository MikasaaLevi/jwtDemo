package com.jwt.services;

import com.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store  = new ArrayList<>();

    public UserService()
    {
        store.add(new User(UUID.randomUUID().toString(),"Anjali S","anjali@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Vicky Raymond","vicky@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"George B","bgeorge@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Savannah S","savannah@gmail.com"));
    }

    public List<User> getAllUsers()
    {
        return this.store;
    }
}
