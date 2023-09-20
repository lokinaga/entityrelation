package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.jpa.AcRepository;

@Repository
public class AcDao {
	@Autowired
	AcRepository ar;

	public String setAc(Ac ac) {
		ar.save(ac);
		return "saved";
	}

	public String setAllAc(List<Ac> acs) {
	 ar.saveAll(acs);
		return "saved" ;
	}

	public List<Ac> getAllAc() {
		return ar.findAll();
		
	}

	public Ac getById(int x) {
		
		return ar.findById(x).get();
	}
}
