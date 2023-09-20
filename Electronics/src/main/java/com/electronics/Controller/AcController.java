package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Ac;
import com.electronics.service.AcService;

@RestController
public class AcController {
	@Autowired
	AcService as;
	
	@PostMapping(value= "/setAc")
	public String setAc(@RequestBody Ac ac) {
		return as.setAc(ac);
		
	}
	@PostMapping(value = "/setAllAc")
	public String setAllAc(@RequestBody List<Ac> acs) {
		return as.setAllAc(acs);
	}
	
    @GetMapping(value = "/getAllAc")
    public List<Ac> getAllAc(){
    	return as.getAllAc();
    }
    @GetMapping(value="/getById/{x}")
    public Ac getById(@PathVariable int x) {
    	return as.getById(x);
    }
    
}
