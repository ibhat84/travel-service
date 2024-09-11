package com.example.travelservice.controller;

import com.example.travelservice.model.Booking;
import com.example.travelservice.model.Flight;
import com.example.travelservice.model.User;
import com.example.travelservice.service.BookingService;
import com.example.travelservice.service.FlightService;
import com.example.travelservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private UserService userService;
    @Autowired
    private FlightService flightService;

    @PostMapping("/book")
    public Booking bookFlight(@RequestParam Long userId, @RequestParam Long flightId) {
        User user = userService.findById(userId);
        Flight flight = flightService.findById(flightId);
        return bookingService.bookFlight(user, flight);
    }
}
