package com.vehicles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.entity.Bike;
import com.vehicles.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping(value ="/setAllBike")
 public String setAllBike(@RequestBody List<Bike> bikes){
		return bs.setAllBike(bikes);
	}
	@GetMapping(value="/getAllBike")
	public List<Bike> getAll(){
		return bs.getAll();
	}
}
