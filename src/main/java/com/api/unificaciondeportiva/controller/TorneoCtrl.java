package com.api.unificaciondeportiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.unificaciondeportiva.model.Torneo;
import com.api.unificaciondeportiva.service.TorneoService;

@RestController
public class TorneoCtrl {

	@Autowired
	private TorneoService torneoService;
	
	@GetMapping("/torneo")
	public List<Torneo> getTorneos(){
		return torneoService.getTorneos();
	}
	
	@GetMapping("/torneo/categoria/{id}")
	public List<Torneo> getTorneosCategoria(@PathVariable int id){
		return torneoService.getTorneosCategoria(id);
	}
	
	@GetMapping("/torneo/{id}")
	public ResponseEntity<Object> getEquipo(@PathVariable int id){
		return torneoService.getTorneo(id);
	}
}
