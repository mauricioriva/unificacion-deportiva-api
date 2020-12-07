package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.unificaciondeportiva.model.Equipo;

public interface EquipoService {
	public abstract List<Equipo> getEquipos();
	public abstract ResponseEntity<Object> getEquipo(int id);
	public abstract List<Equipo> getEquiposCategoria(int id);
}
