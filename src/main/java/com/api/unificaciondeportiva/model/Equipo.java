package com.api.unificaciondeportiva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer id_categoria;
	
	@Size(min=2, message="El nombre de la categoria debe tener al menos 2 letras.")
	private String nombre_equipo;
	
	@Size(min=2, message="El nombre de la categoria debe tener al menos 2 letras.")
	private String color_playera;
	
	@Size(min=2, message="El nombre de la categoria debe tener al menos 2 letras.")
	private String color_short;
	
	private String logo;
	private Integer grupo;
	private Integer estatus;
	private String archivo_registros;
	
	public Equipo() {
		
	}

	public Equipo(Integer id, Integer id_categoria,
			@Size(min = 2, message = "El nombre de la categoria debe tener al menos 2 letras.") String nombre_equipo,
			@Size(min = 2, message = "El nombre de la categoria debe tener al menos 2 letras.") String color_playera,
			@Size(min = 2, message = "El nombre de la categoria debe tener al menos 2 letras.") String color_short,
			String logo, Integer grupo, Integer estatus, String archivo_registros) {
		super();
		this.id = id;
		this.id_categoria = id_categoria;
		this.nombre_equipo = nombre_equipo;
		this.color_playera = color_playera;
		this.color_short = color_short;
		this.logo = logo;
		this.grupo = grupo;
		this.estatus = estatus;
		this.archivo_registros = archivo_registros;
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

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public String getColor_playera() {
		return color_playera;
	}

	public void setColor_playera(String color_playera) {
		this.color_playera = color_playera;
	}

	public String getColor_short() {
		return color_short;
	}

	public void setColor_short(String color_short) {
		this.color_short = color_short;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getArchivo_registros() {
		return archivo_registros;
	}

	public void setArchivo_registros(String archivo_registros) {
		this.archivo_registros = archivo_registros;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", id_categoria=" + id_categoria + ", nombre_equipo=" + nombre_equipo
				+ ", color_playera=" + color_playera + ", color_short=" + color_short + ", logo=" + logo + ", grupo="
				+ grupo + ", estatus=" + estatus + ", archivo_registros=" + archivo_registros + "]";
	}
	
}
