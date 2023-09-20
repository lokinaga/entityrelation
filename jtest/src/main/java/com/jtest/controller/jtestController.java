package com.jtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jtestController {

	
	@GetMapping(value="/getString")
	public String getMsg() {
		return "hi"
;	}
}
