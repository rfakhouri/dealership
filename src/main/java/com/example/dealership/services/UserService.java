package com.example.dealership.services;

import com.example.dealership.model.User;
import com.example.dealership.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        Optional<User> oUser = userRepository.findById(id);
        return oUser.orElse(null);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        Optional<User> oUser = userRepository.findUserByEmailAndPassword(email, password);
        return oUser.orElse(null);
    }

    public User saveUser(User User) {
        userRepository.save(User);
        return User;
    }

    public void deleteUser(Integer id) {
        Optional<User> oUser = userRepository.findById(id);
        oUser.ifPresent(User -> userRepository.delete(User));
    }

}
