package com.spring.validation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.validation.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
