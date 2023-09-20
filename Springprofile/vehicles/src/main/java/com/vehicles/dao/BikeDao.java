package com.vehicles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicles.entity.Bike;
import com.vehicles.repository.BikeRepository;

@Repository
public class BikeDao {
@Autowired
BikeRepository br;
	public String setAllBike(List<Bike> bikes) {
	       br.saveAll(bikes); 
		return "saved bike list" ;
	}
	public List<Bike> getAll() {
		
		return br.findAll();
	}

}
