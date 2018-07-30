package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cinema.cinemaIngeneo.modelo.Funcion;
import com.cinema.cinemaIngeneo.modelo.Pelicula;
import com.cinema.cinemaIngeneo.modelo.Sucursal;

@SuppressWarnings("serial")
@Entity
@Table(name="sucursal_pelicula")
public class SucursalPelicula implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_sucursal", nullable=false)
	private Sucursal sucursal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_pelicula", nullable=false)
	private Pelicula pelicula;
	
	@OneToMany(mappedBy = "sucursalpelicula")
	private List<Funcion> funciones = new ArrayList<Funcion>();

	public SucursalPelicula(int id, Sucursal sucursal, Pelicula pelicula) {
		super();
		this.id = id;
		this.sucursal = sucursal;
		this.pelicula = pelicula;
	}
	
	public SucursalPelicula(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
}

