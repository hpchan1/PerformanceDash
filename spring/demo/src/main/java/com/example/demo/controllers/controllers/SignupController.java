package com.example.demo.controllers.controllers;

import java.util.Map;
import java.util.HashMap;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.security.JwtUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class SignupController{

@Autowired
private UserRepository repository;

@PostMapping(value = "/signup")
public Map<String, String> signup(@RequestBody User user){
    repository.save(user);
    String token = JwtUtils.generateJwt(user);

    Map<String, String> body = new HashMap<>();
    body.put("token", token);

    return body;
}

}