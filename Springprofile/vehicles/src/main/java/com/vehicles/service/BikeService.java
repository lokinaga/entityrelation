package com.vehicles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicles.dao.BikeDao;
import com.vehicles.entity.Bike;

@Service
public class BikeService {
@Autowired
BikeDao bd;
	public String setAllBike(List<Bike> bikes) {
		
		return bd.setAllBike(bikes);
	}
	public List<Bike> getAll() {
		
		return bd.getAll();
	}

}
