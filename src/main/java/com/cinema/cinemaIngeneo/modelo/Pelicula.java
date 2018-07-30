package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;
import java.sql.Date;
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
import com.cinema.cinemaIngeneo.modelo.SucursalPelicula;

@SuppressWarnings("serial")
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="nombre_traducido")
	private String nombre_traducido;
	
	@Column(name="fecha_estreno")
	private Date fecha_estreno;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="fecha_baja")
	private Date fecha_baja;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="sinopsis")
	private String sinopsis;
	
	@Column(name="duracion")
	private int duracion;	

	@OneToMany(mappedBy = "pelicula")
    private List<SucursalPelicula> sucursalpeliculas = new ArrayList<SucursalPelicula>();
	
	@OneToMany(mappedBy = "pelicula")
    private List<FormatoPelicula> formatopelicula = new ArrayList<FormatoPelicula>();

	public Pelicula(int id, String nombre, String nombre_traducido, Date fecha_estreno, String imagen, Date fecha_baja,
			String genero, String sinopsis, int duracion, List<SucursalPelicula> sucursalpeliculas,
			List<FormatoPelicula> formatopelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombre_traducido = nombre_traducido;
		this.fecha_estreno = fecha_estreno;
		this.imagen = imagen;
		this.fecha_baja = fecha_baja;
		this.genero = genero;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.sucursalpeliculas = sucursalpeliculas;
		this.formatopelicula = formatopelicula;
	}
	
	public Pelicula(){}

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

	public String getNombre_traducido() {
		return nombre_traducido;
	}

	public void setNombre_traducido(String nombre_traducido) {
		this.nombre_traducido = nombre_traducido;
	}

	public Date getFecha_estreno() {
		return fecha_estreno;
	}

	public void setFecha_estreno(Date fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public List<SucursalPelicula> getSucursalpeliculas() {
		return sucursalpeliculas;
	}

	public void setSucursalpeliculas(List<SucursalPelicula> sucursalpeliculas) {
		this.sucursalpeliculas = sucursalpeliculas;
	}

	public List<FormatoPelicula> getFormatopelicula() {
		return formatopelicula;
	}

	public void setFormatopelicula(List<FormatoPelicula> formatopelicula) {
		this.formatopelicula = formatopelicula;
	}
	
}

