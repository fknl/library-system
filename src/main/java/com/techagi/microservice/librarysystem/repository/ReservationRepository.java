package com.techagi.microservice.librarysystem.repository;

import com.techagi.microservice.librarysystem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}