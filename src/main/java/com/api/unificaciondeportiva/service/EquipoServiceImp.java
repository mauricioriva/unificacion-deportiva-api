package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.unificaciondeportiva.repository.EquipoRepository;
import com.api.unificaciondeportiva.model.Equipo;

@Service
public class EquipoServiceImp implements EquipoService {
	
	@Autowired
	private EquipoRepository repoEquipo;
	
	@Override
	public List<Equipo> getEquipos(){
		return repoEquipo.findAll();
	}
	
	public ResponseEntity<Object> getEquipo(int id){
		return new ResponseEntity<>(repoEquipo.findById(id), HttpStatus.OK);
	}
	
	public List<Equipo> getEquiposCategoria(int id){
		return repoEquipo.getEquiposCategoria(id);
	}
}
