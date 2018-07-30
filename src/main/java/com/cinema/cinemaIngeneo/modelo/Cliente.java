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

import com.cinema.cinemaIngeneo.modelo.Reserva;

@SuppressWarnings("serial")
@Entity
@Table(name ="cliente")
public class Cliente implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="num_celular")
	private long numCelular;	
	
	@OneToMany(mappedBy = "cliente")
	private List<Reserva> cliente = new ArrayList<Reserva>();
	
	public Cliente(int id, String nombre, int cedula, long numCelular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.numCelular = numCelular;
	}
	
	public Cliente(){}

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

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public long getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(long numCelular) {
		this.numCelular = numCelular;
	}
	
}