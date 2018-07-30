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

import org.springframework.lang.NonNull;

import com.cinema.cinemaIngeneo.modelo.Administrador;
import com.cinema.cinemaIngeneo.modelo.Ciudad;
import com.cinema.cinemaIngeneo.modelo.Sala;
import com.cinema.cinemaIngeneo.modelo.SucursalPelicula;

@SuppressWarnings("serial")
@Entity
@Table(name = "sucursal")
public class Sucursal implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nombre_sucursal")
	@NonNull
	private String nombre_sucursal;

	@Column(name = "direccion_sucursal")
	@NonNull
	private String direccion_sucursal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "administrador_sucursal", nullable=false)
	private Administrador administradorSucursal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_ciudad", nullable=false)
	private Ciudad ciudad;
	
	@OneToMany(mappedBy = "sucursal")
    private List<Sala> salas = new ArrayList<Sala>();
	
	@OneToMany(mappedBy = "sucursal")
    private List<SucursalPelicula> sucursalpeliculas = new ArrayList<SucursalPelicula>();

	public Sucursal(int id, String nombre_sucursal, String direccion_sucursal, Administrador administradorSucursal,
			Ciudad ciudad, List<Sala> salas, List<SucursalPelicula> sucursalpeliculas) {
		super();
		this.id = id;
		this.nombre_sucursal = nombre_sucursal;
		this.direccion_sucursal = direccion_sucursal;
		this.administradorSucursal = administradorSucursal;
		this.ciudad = ciudad;
		this.salas = salas;
		this.sucursalpeliculas = sucursalpeliculas;
	}

	public Sucursal(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_sucursal() {
		return nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}

	public String getDireccion_sucursal() {
		return direccion_sucursal;
	}

	public void setDireccion_sucursal(String direccion_sucursal) {
		this.direccion_sucursal = direccion_sucursal;
	}

	public Administrador getAdministradorSucursal() {
		return administradorSucursal;
	}

	public void setAdministradorSucursal(Administrador administradorSucursal) {
		this.administradorSucursal = administradorSucursal;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public List<SucursalPelicula> getSucursalpeliculas() {
		return sucursalpeliculas;
	}

	public void setSucursalpeliculas(List<SucursalPelicula> sucursalpeliculas) {
		this.sucursalpeliculas = sucursalpeliculas;
	}
	
			
}
