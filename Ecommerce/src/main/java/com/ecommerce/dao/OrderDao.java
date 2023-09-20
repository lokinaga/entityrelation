package com.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Order;
import com.ecommerce.repository.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;

	public String addOrder(Order order) {
		or.save(order);
		return "Saved Order";
	}

}
