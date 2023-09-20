package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.OrderDao;
import com.ecommerce.entity.Order;

@Service
public class OrderService {
	@Autowired
	OrderDao od;

	public String addOrder(Order order) {
		
		return od.addOrder(order);
	}
	
	
	

}
