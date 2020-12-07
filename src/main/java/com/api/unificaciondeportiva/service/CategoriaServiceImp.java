package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.unificaciondeportiva.repository.CategoriaRepository;
import com.api.unificaciondeportiva.service.CategoriaService;
import com.api.unificaciondeportiva.model.Categoria;

@Service
public class CategoriaServiceImp implements CategoriaService {

	@Autowired
	private CategoriaRepository repoCategoria;
	
	@Override
	public List<Categoria> getCategorias(){
		return repoCategoria.findAll();
	}
	
	public ResponseEntity<Object> getCategoria(int id){
		return new ResponseEntity<>(repoCategoria.findById(id), HttpStatus.OK);
	}
}
