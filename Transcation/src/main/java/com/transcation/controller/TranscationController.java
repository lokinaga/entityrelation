package com.transcation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transcation.entity.Transcation;
import com.transcation.service.TranscationService;

@RestController
public class TranscationController {
@Autowired
TranscationService ts;
    

    @PostMapping (value ="/setTrans")
	public String setTrans(@RequestBody Transcation transcation) {
    	return ts.setTrans(transcation);
    }
    @PostMapping(value ="/setAllTrans")
    public String setAllTrans(@RequestBody List<Transcation>  trs) {
    	return ts.setAllTrans(trs);
    }
	
	
	
	
	
	
	
	
	
	
	
	
}


