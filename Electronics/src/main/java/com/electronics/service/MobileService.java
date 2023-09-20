package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public String setMobile(Mobile mobile) {
		
		return md.setMobile(mobile);
	}
	public String setMobiles(List<Mobile> mobile) {
		
		return md.setMobiles(mobile);
	}
	public List<Mobile> getAllMobile() {
	
		return md.getAllMobile();
	}
	public Mobile getByIdMobile(int a) {
		
		return md.getByIdMobile(a);
	}
	public List<Mobile> getByBrandMobile(String b) {
		
		return md.getByBrandMobile(b);
	}
	public List<Mobile> getByRamMobile(int c) {
		
		return md.getByRamMobile(c);
	}
	public List<Mobile> getByRange(int d, int e) {
		
		return md.getByRange(d,e);
	}
	
	
	
	

}
