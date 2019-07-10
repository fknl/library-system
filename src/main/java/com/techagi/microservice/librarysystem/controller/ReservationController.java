package com.techagi.microservice.librarysystem.controller;

import com.techagi.microservice.librarysystem.entity.Reservation;
import com.techagi.microservice.librarysystem.repository.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody Reservation reservation){
        reservation.setDateIn(new Date());
        return reservationRepository.save(reservation);
    }


    @GetMapping("/reservation/{id}")
    public Reservation createReservation(@PathVariable Long id){
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.orElseGet(()->new Reservation());

    }





}
