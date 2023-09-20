package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.Bike;
import com.vehicle.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	
	@PostMapping(value ="/setBike")
	
	public String setBike(@RequestBody Bike bike) {
		return bs.setBike(bike);
	}
   @PostMapping (value ="/setBikes")
   public String setBikes(@RequestBody List<Bike> bikes){
	   return bs.setBikes(bikes);
   }
   @GetMapping(value ="/getBikes")
   public List<Bike> getAllBikes(){
	   return bs.getAllBikes();
   }
   @GetMapping(value ="/getById/{y}")
   public Bike getById(@PathVariable int y) {
	
	   return bs.getById(y);
   }
   @DeleteMapping(value ="/deleteById/{id}")
   public String deleteById(@PathVariable int id) {
	   return bs.deleteById(id);
   }
   @GetMapping(value = "/getByBrand/{b}")
   public List<Bike> getByBrand(@PathVariable String b){
	   return bs.getByBrand(b);
   }
   @GetMapping(value= "/getByRange/{c}/{d}")
   public List<Bike> getByRange(@PathVariable int c,@PathVariable int d){
	   return bs.getByRange(c,d);
   }
   @GetMapping(value = "/getBikeColor/{e}")
   public List<String> getBrandBikeColor(@PathVariable String e){
	   return bs.getBrandBikeColor(e);
   }
   @GetMapping(value= "/getMax")
   public Bike getMax() {
	   return bs.getMax();
	   
   }
   @GetMapping(value = "/getMin")
   public Bike getMin() {
	   return bs. getMin();
	   
   }
   @GetMapping(value = "/getReducedBike/{w}")
   public List<Bike> getReducedBike(@PathVariable int w){
	   return bs.getReducedBike(w);
   }
   @GetMapping(value = "/getPetrolType/{k}") 
   public Long getPetrolBike(@PathVariable String k){
	   return bs.getPetrolBike(k);
	   
   }
}
