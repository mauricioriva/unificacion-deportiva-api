package com.api.unificaciondeportiva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.unificaciondeportiva.model.Torneo;

public interface TorneoRepository extends JpaRepository<Torneo, Integer>{

	@Query(value="SELECT * FROM torneo WHERE id_categoria = :id", nativeQuery=true)
	List<Torneo> getTorneosCategoria(int id);
	
}
