package com.ibm.traveler.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.traveler.entity.Traveler;
import com.ibm.traveler.repository.TravelerRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("traveler")
public class TravelerController {
	
	TravelerRepository travelerRepository;
	
	@PostMapping
	public ResponseEntity<Traveler> create(@RequestBody Traveler traveler){
		return new ResponseEntity<Traveler>(travelerRepository.save(traveler),HttpStatus.CREATED);
	}
	
	@GetMapping
    public ResponseEntity<List<Traveler>> getAll(){
        return ResponseEntity.ok(travelerRepository.findAll());
    }

}
