package com.spring.validation.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.validation.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    Optional<Reservation> findFirstByOrderByIdDesc();

    Optional<Reservation> findByCode(String code);
}
