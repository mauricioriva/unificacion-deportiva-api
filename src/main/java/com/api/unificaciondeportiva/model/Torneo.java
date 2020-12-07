package com.api.unificaciondeportiva.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Torneo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer id_categoria;
	
	@Size(min=2, message="El nombre del torneo debe tener al menos 2 letras.")
	private String nombre_torneo;
	private Date fecha_inicio;
	private Integer estatus;
	
	public Torneo() {
		
	}

	public Torneo(Integer id, Integer id_categoria,
			@Size(min = 2, message = "El nombre del torneo debe tener al menos 2 letras.") String nombre_torneo,
			Date fecha_inicio, Integer estatus) {
		super();
		this.id = id;
		this.id_categoria = id_categoria;
		this.nombre_torneo = nombre_torneo;
		this.fecha_inicio = fecha_inicio;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_torneo() {
		return nombre_torneo;
	}

	public void setNombre_torneo(String nombre_torneo) {
		this.nombre_torneo = nombre_torneo;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Torneo [id=" + id + ", id_categoria=" + id_categoria + ", nombre_torneo=" + nombre_torneo
				+ ", fecha_inicio=" + fecha_inicio + ", estatus=" + estatus + "]";
	}
	
}
