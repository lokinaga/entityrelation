package com.endproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endproduct.dao.EndProductDao;
import com.endproduct.entity.EndProduct;
@Service
public class EndProductService {
@Autowired
EndProductDao epd;
	public String setAllEndProduct(List<EndProduct> g) {
		
		return epd.setAllEndProduct(g);
	}

}
