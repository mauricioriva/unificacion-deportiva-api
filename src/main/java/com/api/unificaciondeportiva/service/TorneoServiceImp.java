package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.unificaciondeportiva.model.Torneo;
import com.api.unificaciondeportiva.repository.TorneoRepository;

@Service
public class TorneoServiceImp implements TorneoService{

	@Autowired
	private TorneoRepository torneoRepository;
	
	@Override
	public List<Torneo> getTorneos() {
		return torneoRepository.findAll();
	}

	@Override
	public ResponseEntity<Object> getTorneo(int id) {
		return new ResponseEntity<>(torneoRepository.findById(id), HttpStatus.OK);
	}

	@Override
	public List<Torneo> getTorneosCategoria(int id) {
		return torneoRepository.getTorneosCategoria(id);
	}

}
