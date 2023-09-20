package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Order;
import com.ecommerce.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	
	
	
	
	@PostMapping(value="/addOrder")
	public String addOrder(@RequestBody Order order) {
		return os.addOrder(order);
	}

}
