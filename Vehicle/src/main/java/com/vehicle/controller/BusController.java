package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.IdNotFoundException;
import com.vehicle.customexception.InvalidBoardException;
import com.vehicle.entity.Bus;
import com.vehicle.service.BusService;

@RestController
public class BusController {
	@Autowired
	BusService bs;

	@PatchMapping(value = "/setBus")
	public String setBus(@RequestBody Bus bus)throws InvalidBoardException {
		return bs.setBus(bus);
	}
	@PostMapping(value = "/setAllBuses")
	public String setAllBuses(@RequestBody List<Bus> buses)throws InvalidBoardException  {
		return bs.setAllBuses(buses);
	}		

	
	@GetMapping(value ="/getAllBus")
	public List<Bus> getAllBus(){
		return bs.getAllBus();
	}
	@GetMapping(value = "/getByIdBus/{a}")
	public Bus getByIdBus(@PathVariable int a)throws IdNotFoundException{
		return bs.getByIdBus(a);
	}
	@GetMapping(value= "/getByBrandBus/{b}")
	public List<Bus> getByBrandBus(@PathVariable String b)throws BrandNotFoundException {
		return bs.getByBrandBus(b);
	}
	@PutMapping(value="/updateBus/{id}")
	public String updateBus(@PathVariable int id, @RequestBody Bus b) throws InvalidBoardException, IdNotFoundException {
		return bs.updateBus(id,b);
	}
}
