package com.api.unificaciondeportiva.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.unificaciondeportiva.model.Categoria;

public interface CategoriaService {
	public abstract List<Categoria> getCategorias();
	public abstract ResponseEntity<Object> getCategoria(int id);
}
