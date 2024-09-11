package com.example.travelservice.repository;

import com.example.travelservice.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureAndDestination(String departure, String destination);
}
