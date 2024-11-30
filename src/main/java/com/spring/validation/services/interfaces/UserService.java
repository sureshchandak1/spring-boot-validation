package com.spring.validation.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.spring.validation.model.User;

public interface UserService {

    User create(User user);

    List<User> findAll();

    Optional<User> findById(int id);
}
