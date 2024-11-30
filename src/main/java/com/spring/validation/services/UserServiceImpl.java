package com.spring.validation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.validation.model.Address;
import com.spring.validation.model.User;
import com.spring.validation.repositories.AddressRepository;
import com.spring.validation.repositories.UserRepository;
import com.spring.validation.services.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final AddressRepository addressRepository;

    public UserServiceImpl(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public User create(User user) {
        Address persistedAddress = addressRepository.save(user.getAddress());

        user.setAddress(persistedAddress);

        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }
}
