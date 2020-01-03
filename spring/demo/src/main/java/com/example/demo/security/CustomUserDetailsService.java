package com.example.demo.security;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    // have to use the name loadUserByUsername due to old naming conventions
    @Override
    public UserDetails loadUserByUsername(String loginField) {
        User usernameUser = repository.findByUsername(loginField);
        

        if (usernameUser != null) {
            return new CustomUserPrincipal(usernameUser);
        } else {
            throw new UsernameNotFoundException(loginField);
        }

        
    }

    public User getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User currentUser = null;

        if (principal instanceof String) {
            String username = (String) principal;
            currentUser = repository.findByUsername(username);
        } else if (principal instanceof CustomUserPrincipal) {
            CustomUserPrincipal customPrincipal = (CustomUserPrincipal) principal;
            currentUser = customPrincipal.getUser();
        }
        
       return currentUser;
    }
}
