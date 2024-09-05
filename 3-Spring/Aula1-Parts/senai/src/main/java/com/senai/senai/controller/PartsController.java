package com.senai.senai.controller;

import com.senai.senai.models.Parts;
import com.senai.senai.models.dto.PartsDto;
import com.senai.senai.models.dto.UpdatePartsDto;
import com.senai.senai.repository.PartsRepository;
import com.senai.senai.service.PartsService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api") //opcional
@CrossOrigin(origins = "*") //CORS
public class PartsController {

    @Autowired
    PartsService partsService;

    @GetMapping("/parts")
    public ResponseEntity<List<Parts>> getAllParts() {
        //select *from parts;
        List<Parts> parts = partsService.getAllParts();
        return ResponseEntity.ok(parts);
    }

    @PostMapping("/parts")
    public ResponseEntity<List<Parts>> addNewPart(@RequestBody @Valid List<PartsDto> parts) {

        List<Parts> partsList = parts.stream().map(dto -> {
            Parts convertedPart = new Parts();
            BeanUtils.copyProperties(dto, convertedPart);
            return convertedPart;
        }).toList();

        /*List<Parts> modo2 = new ArrayList<>();
        for(PartsDto dto : parts) {
            Parts convertedPart = new Parts();
            BeanUtils.copyProperties(dto, convertedPart);
            modo2.add(convertedPart);
        }     */

        return ResponseEntity.status(HttpStatus.CREATED).body(
                partsService.saveParts(partsList));
    }


    @PutMapping("/parts/{id}")
    public ResponseEntity<Parts> updatePart(
            @PathVariable UUID id,
            @RequestBody @Valid UpdatePartsDto part) {
        part.setId(id);
        Parts convertedPart = new Parts();
        BeanUtils.copyProperties(part, convertedPart);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                partsService.updatePart(convertedPart));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/parts/{id}")
    public void deletePart(@PathVariable UUID id) {
        partsService.deletePart(id);
    }



}