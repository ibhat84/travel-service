package com.example.travelservice.service;

import com.example.travelservice.model.Flight;
import com.example.travelservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> searchFlights(String departure, String destination) {
        return flightRepository.findByDepartureAndDestination(departure, destination);
    }

    public Flight findById(Long id) {
        Optional<Flight> optionalFlight = flightRepository.findById(id);
        if (optionalFlight.isPresent()) {
            return optionalFlight.get();
        } else {
            throw new RuntimeException("Flight not found with ID: " + id);
        }
    }

    public Flight createFlight(Flight flight) {
        // Save the flight to the database
        return flightRepository.save(flight);
    }
}
