package com.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.Bike;
import com.vehicle.jpa.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public String setBike(Bike bike) {
		br.save(bike);
		return "saved";
	}
	public String setBikes(List<Bike> bikes) {
	
		br.saveAll(bikes);
		return "saved";
	}
	public List<Bike> getAllBikes() {
		
		return br.findAll();
	}
	public Bike getById(int y) {
		
		return br.findById(y).get();
	
	}
	public String deleteById(int id) {
		br.deleteById(id);
		return "delete successful";
	}

}

