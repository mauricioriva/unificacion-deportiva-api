package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.unificaciondeportiva.model.Torneo;

public interface TorneoService {

	public abstract List<Torneo> getTorneos();
	public abstract ResponseEntity<Object> getTorneo(int id);
	public abstract List<Torneo> getTorneosCategoria(int id);
	
}
