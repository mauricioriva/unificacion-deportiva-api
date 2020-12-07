package com.api.unificaciondeportiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.unificaciondeportiva.service.EquipoService;
import com.api.unificaciondeportiva.model.Equipo;

@RestController
public class EquipoCtrl {
	
	@Autowired
	private EquipoService equipoService;
	
	@GetMapping("/equipo")
	public List<Equipo> getEquipos(){
		return equipoService.getEquipos();
	}
	
	@GetMapping("/equipo/categoria/{id}")
	public List<Equipo> getEquiposCategoria(@PathVariable int id){
		return equipoService.getEquiposCategoria(id);
	}
	
	@GetMapping("/equipo/{id}")
	public ResponseEntity<Object> getEquipo(@PathVariable int id){
		return equipoService.getEquipo(id);
	}
}
