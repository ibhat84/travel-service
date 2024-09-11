package com.example.travelservice.service;

import com.example.travelservice.model.User;
import com.example.travelservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Fetch the user from the database by username
        User user = userRepository.findByUsername(username);

        // If user is not found, throw an exception
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        // Return a new instance of org.springframework.security.core.userdetails.User
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                Collections.emptyList() // For simplicity, no roles/authorities are added
        );
    }
}
