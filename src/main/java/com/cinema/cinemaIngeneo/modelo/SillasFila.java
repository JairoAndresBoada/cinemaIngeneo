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

import com.cinema.cinemaIngeneo.modelo.Fila;
import com.cinema.cinemaIngeneo.modelo.SillasFila;
import com.cinema.cinemaIngeneo.modelo.Sucursal;

@SuppressWarnings("serial")
@Entity
@Table(name ="silla_fila")
public class SillasFila implements Serializable {
	
	
	@Id
	@Column(name = "id_")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sucursal", nullable=false)
	private Sucursal sucursal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_fila", nullable=false)
	private Fila fila;
	
	@Column(name="fila")
	private String nombre;
	
	@Column(name="total_sillas")
	private int totalSillas;
	
	@OneToMany(mappedBy = "sillafila")
	private List<SillasFila> sillafila = new ArrayList<SillasFila>();

	public SillasFila(int id, Sucursal sucursal, Fila fila, String nombre, int totalSillas,
			List<SillasFila> sillafila) {
		super();
		this.id = id;
		this.sucursal = sucursal;
		this.fila = fila;
		this.nombre = nombre;
		this.totalSillas = totalSillas;
		this.sillafila = sillafila;
	}
	
	public SillasFila(){}

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

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotalSillas() {
		return totalSillas;
	}

	public void setTotalSillas(int totalSillas) {
		this.totalSillas = totalSillas;
	}

	public List<SillasFila> getSillafila() {
		return sillafila;
	}

	public void setSillafila(List<SillasFila> sillafila) {
		this.sillafila = sillafila;
	}
	
}
