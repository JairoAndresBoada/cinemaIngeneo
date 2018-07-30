package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cinema.cinemaIngeneo.modelo.FormatoPelicula;
import com.cinema.cinemaIngeneo.modelo.SalaFormatos;

@SuppressWarnings("serial")
@Entity
@Table(name = "formato")
public class Formato implements Serializable {
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "formato")
    private List<SalaFormatos> salaFormato = new ArrayList<SalaFormatos>();
	
	@OneToMany(mappedBy = "formato")
    private List<FormatoPelicula> formatopelicula = new ArrayList<FormatoPelicula>();

	public Formato(int id, String nombre, List<SalaFormatos> salaFormato, List<FormatoPelicula> formatopelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salaFormato = salaFormato;
		this.formatopelicula = formatopelicula;
	}
	
	public Formato(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<SalaFormatos> getSalaFormato() {
		return salaFormato;
	}

	public void setSalaFormato(List<SalaFormatos> salaFormato) {
		this.salaFormato = salaFormato;
	}

	public List<FormatoPelicula> getFormatopelicula() {
		return formatopelicula;
	}

	public void setFormatopelicula(List<FormatoPelicula> formatopelicula) {
		this.formatopelicula = formatopelicula;
	}
}
