package com.spring.validation.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.spring.validation.model.Reservation;

public interface ReservationService {

    Reservation create(Reservation reservation);

    List<Reservation> findAll();

    Optional<Reservation> findByCode(String code);
}
