package com.api.unificaciondeportiva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min=2, message="El nombre de la categoria debe tener al menos 2 letras.")
	private String nombre_categoria;
	
	private Integer lunes;
	private Integer martes;
	private Integer miercoles;
	private Integer jueves;
	private Integer viernes;
	private Integer sabado;
	private Integer domingo;
	private Integer duracion_partidos;
	private Integer estatus;
	
	public Categoria() {
		
	}

	public Categoria(Integer id,
			@Size(min = 2, message = "El nombre de la categoria debe tener al menos 2 letras.") String nombre_categoria,
			Integer lunes, Integer martes, Integer miercoles, Integer jueves, Integer viernes, Integer sabado,
			Integer domingo, Integer duracion_partidos, Integer estatus) {
		super();
		this.id = id;
		this.nombre_categoria = nombre_categoria;
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
		this.domingo = domingo;
		this.duracion_partidos = duracion_partidos;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public Integer getLunes() {
		return lunes;
	}

	public void setLunes(Integer lunes) {
		this.lunes = lunes;
	}

	public Integer getMartes() {
		return martes;
	}

	public void setMartes(Integer martes) {
		this.martes = martes;
	}

	public Integer getMiercoles() {
		return miercoles;
	}

	public void setMiercoles(Integer miercoles) {
		this.miercoles = miercoles;
	}

	public Integer getJueves() {
		return jueves;
	}

	public void setJueves(Integer jueves) {
		this.jueves = jueves;
	}

	public Integer getViernes() {
		return viernes;
	}

	public void setViernes(Integer viernes) {
		this.viernes = viernes;
	}

	public Integer getSabado() {
		return sabado;
	}

	public void setSabado(Integer sabado) {
		this.sabado = sabado;
	}

	public Integer getDomingo() {
		return domingo;
	}

	public void setDomingo(Integer domingo) {
		this.domingo = domingo;
	}

	public Integer getDuracion_partidos() {
		return duracion_partidos;
	}

	public void setDuracion_partidos(Integer duracion_partidos) {
		this.duracion_partidos = duracion_partidos;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre_categoria=" + nombre_categoria + ", lunes=" + lunes + ", martes="
				+ martes + ", miercoles=" + miercoles + ", jueves=" + jueves + ", viernes=" + viernes + ", sabado="
				+ sabado + ", domingo=" + domingo + ", duracion_partidos=" + duracion_partidos + ", estatus=" + estatus
				+ "]";
	}
}
