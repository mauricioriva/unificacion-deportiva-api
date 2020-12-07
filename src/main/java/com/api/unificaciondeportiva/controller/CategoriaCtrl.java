package com.api.unificaciondeportiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.unificaciondeportiva.service.CategoriaService;
import com.api.unificaciondeportiva.model.Categoria;

@RestController
public class CategoriaCtrl {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categoria")
	public List<Categoria> getCategorias(){
		return categoriaService.getCategorias();
	}
		
	@GetMapping("/categoria/{id}")
	public ResponseEntity<Object> getCategoria(@PathVariable int id){
		return categoriaService.getCategoria(id);
	}
}
