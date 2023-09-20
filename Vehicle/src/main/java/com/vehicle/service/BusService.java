package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.IdNotFoundException;
import com.vehicle.customexception.InvalidBoardException;
import com.vehicle.dao.BusDao;
import com.vehicle.entity.Bus;

@Service
public class BusService {
	@Autowired
	BusDao bd;

	public String setBus(Bus bus) throws InvalidBoardException {

		
			if (bus.getBoard().equalsIgnoreCase("white")) {

				return bd.setBus(bus);
			} else {
				
			
				throw new InvalidBoardException("invaild");
			}
		
		}
	

	public String setAllBuses(List<Bus> buses) throws InvalidBoardException {
		List<Bus> s = buses.stream()
				.filter(x -> x.getBoard().equalsIgnoreCase("white") || x.getBoard().equalsIgnoreCase("yellow"))
				.toList();
		if (s.isEmpty()) {
			throw new InvalidBoardException("invalid data");
		} else {

			return bd.setAllBuses(s);

		}

	}

	public List<Bus> getAllBus() {

		return bd.getAllBus();
	}

	public Bus getByIdBus(int a)throws IdNotFoundException {

		return bd.getByIdBus(a);
	}

	public List<Bus> getByBrandBus(String b) throws BrandNotFoundException{
	List<Bus> x =bd.getByBrandBus(b);
		if(x.isEmpty()) {
			throw new BrandNotFoundException("invalid");
		}
		else {
			
		
		return x;
		}
	}

//update
	public String updateBus(int id, Bus b) throws InvalidBoardException, IdNotFoundException {
		Bus x =  getByIdBus(id);
		Bus y = b;
		x.setId(id);
		x.setName(y.getName());
		x.setBoard(y.getBoard());
		x.setNoOfSeats(y.getNoOfSeats());
		x.setNoPlate(y.getNoPlate());
		x.setType(y.getType());
		return setBus(x);
	}
}
