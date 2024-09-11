package com.example.travelservice.service;

import com.example.travelservice.model.Booking;
import com.example.travelservice.model.Flight;
import com.example.travelservice.model.User;
import com.example.travelservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookFlight(User user, Flight flight) {
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setFlight(flight);
        return bookingRepository.save(booking);
    }
}
