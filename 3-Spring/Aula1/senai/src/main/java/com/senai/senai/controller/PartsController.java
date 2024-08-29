package com.senai.senai.controller;

import com.senai.senai.models.Parts;
import com.senai.senai.repository.PartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") //opcional
@CrossOrigin(origins = "*") //CORS
public class PartsController {

    @Autowired
    PartsRepository partsRepository;

    @GetMapping("/parts")
    public ResponseEntity<List<Parts>> getAllParts() {
        //select *from parts;
        List<Parts> parts = partsRepository.findAll();
        return ResponseEntity.ok(parts);
    }




}
