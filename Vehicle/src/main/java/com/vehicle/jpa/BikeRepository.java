package com.vehicle.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.entity.Bike;



public interface BikeRepository extends JpaRepository<Bike, Integer> {
	

}
