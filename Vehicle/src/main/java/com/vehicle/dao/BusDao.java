package com.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.customexception.IdNotFoundException;
import com.vehicle.entity.Bus;
import com.vehicle.jpa.BusRepository;

@Repository
public class BusDao {
	@Autowired
	BusRepository br;

	public String setBus(Bus bus) {
		br.save(bus);
		return "saved";
	}

	public String setAllBuses(List<Bus> buses) {
		   br.saveAll(buses);
		return "saved";
	}

	public List<Bus> getAllBus() {
		
		return br.findAll();
	}

	public Bus getByIdBus(int a)throws IdNotFoundException {
		
		return br.findById(a).orElseThrow(()-> new IdNotFoundException("id not found"));
	}

	public List<Bus> getByBrandBus(String b) {
		
		return br.findByBrand(b);
	}

}
