package com.example.jwtdemo.repositories;

import com.example.jwtdemo.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email, "123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}
