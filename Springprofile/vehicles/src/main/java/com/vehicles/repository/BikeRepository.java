package com.vehicles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
