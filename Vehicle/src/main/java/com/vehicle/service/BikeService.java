package com.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dao.BikeDao;
import com.vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;

	public String setBike(Bike bike) {
		return bd.setBike(bike);
	}

	public String setBikes(List<Bike> bikes) {

		return bd.setBikes(bikes);
	}

	public List<Bike> getAllBikes() {

		return bd.getAllBikes();
	}

	public Bike getById(int y) {

		return bd.getById(y);
	}

	public String deleteById(int id) {

		return bd.deleteById(id);
	}

	public List<Bike> getByBrand(String b) { // service Implement method
		List<Bike> x = getAllBikes();
		List<Bike> y = x.stream().filter(z -> z.getBrand().equalsIgnoreCase(b)).collect(Collectors.toList());

		return y;
	}

	public List<Bike> getByRange(int c, int d) {
		List<Bike> p = getAllBikes();
		List<Bike> q = p.stream().filter(u -> u.getPrice() > c && u.getPrice() < d).collect(Collectors.toList());
		return q;
	}

	public List<String> getBrandBikeColor(String e) {
		List<Bike> l = getAllBikes();
		List<String> m = l.stream().filter(o -> o.getColor().equalsIgnoreCase(e)).map(t -> t.getBrand())
				.collect(Collectors.toList());
		return m;
	}

	public Bike getMax() {
		List<Bike> g = getAllBikes();
		Bike maxPrice = g.stream().max(Comparator.comparingInt(Bike::getPrice)).get();
		return maxPrice;
	}

	public Bike getMin() {
		List<Bike> h = getAllBikes();
		Bike minPrice = h.stream().min(Comparator.comparingInt(Bike::getPrice)).get();
		return minPrice;

	}

	public List<Bike> getReducedBike(int w) {
		List<Bike> i = getAllBikes();
//		List<Bike> f = i.stream().map(c-> {
//			int num = c.getPrice();
//			int net = num - num*w/100;
//			c.setPrice(net);
//			return c;}).collect(Collectors.toList());
//		return f;

		List<Bike> f = i.stream().peek(x -> x.setPrice(x.getPrice() - x.getPrice() * w / 100))
				.collect(Collectors.toList());
		return f;
	}

	public Long getPetrolBike(String k) {
	List<Bike> d= getAllBikes();
	List<Bike> f = d.stream().filter(x->x.getFuelType().equalsIgnoreCase(k)).collect(Collectors.toList());
		long b = f.stream().count();
		return b;
	}

}
