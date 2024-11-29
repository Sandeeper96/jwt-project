package com.jwt.project.jwt.project;

import com.jwt.project.jwt.project.modals.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"sandeep kumar","sandeep@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"suresh kumar","suresh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ashu kumar","ashu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"golu kumar","golu@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
