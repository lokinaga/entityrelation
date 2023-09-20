package com.endproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.endproduct.entity.EndProduct;
import com.endproduct.service.EndProductService;


@RestController

public class EndProductController {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getUpperString")
	public String getUpperString() {
		String url = "http://localhost:8081/getString";
		ResponseEntity<String> r = rt.exchange(url, HttpMethod.GET, null, String.class);
		String s = r.getBody();
		return s.toUpperCase();
	}

	@GetMapping(value = "/getAllEndProduct")
	public List<EndProduct> getAllEndProduct() {
		String url1 = "http://localhost:8081/getAllPro";
        String url2 = "http://localhost:8083/getTaxByHsn/";
        
		ResponseEntity<List<EndProduct>> r1 = rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<EndProduct>>() {});
		List<EndProduct> ep = r1.getBody();
		ep.forEach(x -> {
			int hsn = x.getHsn();
			ResponseEntity<Integer> r2 = rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
			int tax = r2.getBody();
			x.setPrice(x.getPrice()+x.getPrice()*tax/100);
		});
		return ep;
	}
	@Autowired
	
	EndProductService eps;
	@PostMapping(value ="/setAllEndProduct")
	public String setAllEndProduct() {
		List<EndProduct> g = getAllEndProduct();
		return eps.setAllEndProduct(g);
	}
	
	
	

}
