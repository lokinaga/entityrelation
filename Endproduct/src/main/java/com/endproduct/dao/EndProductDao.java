package com.endproduct.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.endproduct.entity.EndProduct;
import com.endproduct.repository.EndProductRepository;

@Repository
public class EndProductDao {
	@Autowired
	EndProductRepository epr;

	public String setAllEndProduct(List<EndProduct> g) {
		
		epr.saveAll(g);
		return "saved";
	}
	
	
	

}
