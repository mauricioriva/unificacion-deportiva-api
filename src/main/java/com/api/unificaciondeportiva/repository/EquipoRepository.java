package com.api.unificaciondeportiva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.unificaciondeportiva.model.Equipo;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer>{
	
	@Query(value="SELECT * FROM equipo WHERE id_categoria = :id", nativeQuery=true)
	List<Equipo> getEquiposCategoria(int id);
	
}
