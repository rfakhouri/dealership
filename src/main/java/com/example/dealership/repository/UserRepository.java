package com.example.dealership.repository;

import com.example.dealership.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, Integer> {
    Optional<User> findUserByEmailAndPassword(String email, String password);
}
