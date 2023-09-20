package com.transcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transcation.entity.Transcation;

public interface TranscationRepository extends JpaRepository<Transcation, Integer>{

}
