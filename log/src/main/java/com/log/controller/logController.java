package com.log.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class logController {
	Logger log = Logger.getLogger(logController.class);
	@GetMapping(value ="/getString")
	public String getMsg() {
		PropertyConfigurator.configure("log.properties");
		log.info("say hi");
		return "hi";
	}
	
	

}
