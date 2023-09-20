package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Mobile;
import com.electronics.jpa.MobileRepository;
@Repository
public class MobileDao {
@Autowired
MobileRepository mr;
	public String setMobile(Mobile mobile) {
		
		mr.save(mobile);
		return "saved";
	}
	public String setMobiles(List<Mobile> mobile) {
		mr.saveAll(mobile);
		return "saved";
	}
	public List<Mobile> getAllMobile() {
		
		return mr.findAll();
	}
	public Mobile getByIdMobile(int a) {
		
		return mr.findById(a).get();
	}
	public List<Mobile> getByBrandMobile(String b) {
		
		return mr.findByBrand(b);
	}
	public List<Mobile> getByRamMobile(int c) {
		
		return mr.findByRam(c);
	}
	public List<Mobile> getByRange(int d, int e) {
		
		return mr.findByRange(d,e);
	}

}
