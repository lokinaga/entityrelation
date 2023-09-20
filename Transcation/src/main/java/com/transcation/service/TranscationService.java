package com.transcation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transcation.dao.TranscationDao;
import com.transcation.entity.Transcation;

@Service
public class TranscationService {
@Autowired
TranscationDao td;

public String setTrans(Transcation transcation) {
	
	return td.setTrans(transcation);
}

public String setAllTrans(List<Transcation> trs) {
	
	return td.setAllTrans(trs);
}
  
}
