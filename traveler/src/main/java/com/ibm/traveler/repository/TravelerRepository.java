package com.ibm.traveler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.traveler.entity.Traveler;

public interface TravelerRepository extends JpaRepository<Traveler, Long> {

}
