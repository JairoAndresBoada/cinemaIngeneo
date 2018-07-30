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

import org.springframework.lang.NonNull;

import com.cinema.cinemaIngeneo.modelo.Sucursal;

@SuppressWarnings("serial")
@Entity 
@Table(name="administrador")
public class Administrador implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="nombre")
	@NonNull
	private String nombre;
	
	
	@OneToMany(mappedBy = "administradorSucursal")
    private List<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	public Administrador(int id, String nombre, List<Sucursal> sucursales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sucursales = sucursales;
	}

	public Administrador() {}

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

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	
}