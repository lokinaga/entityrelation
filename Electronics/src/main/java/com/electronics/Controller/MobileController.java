package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
public class MobileController {
	@Autowired
	MobileService ms;
	
	@PostMapping(value= "/setMobile")
	public String setMobile(@RequestBody Mobile mobile) {
		return ms.setMobile(mobile);
	}
	@PostMapping(value= "/setMobiles")
	public String setMobiles(@RequestBody List<Mobile> mobile) {
		return ms.setMobiles(mobile);
	}
	@GetMapping(value= "/getAllMobile")
	public List<Mobile> getAllMobile(){
		return ms.getAllMobile();
	}
    @GetMapping(value = "/getByIdMobile/{a}")
    	public Mobile getByIdMobile(@PathVariable int a) {
    	return ms.getByIdMobile(a);
    }
    @GetMapping(value ="/getByBrandMobile/{b}")
    public List<Mobile> getByBrandMobile(@PathVariable String b) {
    	return ms.getByBrandMobile(b);
    	
    }
    @GetMapping(value = "/getByRamMobile/{c}")
    public List<Mobile> getByRamMobile(@PathVariable int c){
    	return ms.getByRamMobile(c);
    	
    }
    @GetMapping(value ="/getByRange/{d}/{e}")
    public List<Mobile> getByRange(@PathVariable int d,@PathVariable int e){
    	return ms.getByRange(d,e);
    	
    }
}
