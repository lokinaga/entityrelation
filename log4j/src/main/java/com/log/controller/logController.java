package com.log.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logController {
	
	
	
	@GetMapping(value ="/getString")
	public String getmsg() {
		return "Hi welcome";
	}

}
