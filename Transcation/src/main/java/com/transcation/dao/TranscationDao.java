package com.transcation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transcation.entity.Transcation;
import com.transcation.repository.TranscationRepository;
@Repository
public class TranscationDao {
@Autowired
TranscationRepository tr;
	public String setTrans(Transcation transcation) {
		tr.save(transcation);
		return "saved successfully";
	}
	public String setAllTrans(List<Transcation> trs) {
		tr.saveAll(trs);
		return "saved successfully";
	}

}
