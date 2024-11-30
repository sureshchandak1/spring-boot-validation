package com.spring.validation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.validation.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
