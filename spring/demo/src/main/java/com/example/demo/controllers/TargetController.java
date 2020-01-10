package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entities.Target;
import com.example.demo.repositories.TargetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TargetController{

@Autowired
TargetRepository repo;

@GetMapping(value = "/target")
public List<Target> index(){
    return repo.getAll();
}

}