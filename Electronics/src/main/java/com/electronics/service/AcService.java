package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.AcDao;
import com.electronics.entity.Ac;


@Service
public class AcService {
	@Autowired
	AcDao ad;

	public String setAc( Ac ac) {
		return ad.setAc(ac);
	}

	public String setAllAc(List<Ac> acs) {
		
		return ad.setAllAc(acs);
	}

	public List<Ac> getAllAc() {
		
		return ad.getAllAc();
	}

	public Ac getById(int x) {
		
		return ad.getById(x);
	}

	
	}


