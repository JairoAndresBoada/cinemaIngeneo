package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cinema.cinemaIngeneo.modelo.Formato;
import com.cinema.cinemaIngeneo.modelo.Pelicula;

@SuppressWarnings("serial")
@Entity
@Table(name = "formato_pelicula")
public class FormatoPelicula implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_pelicula", nullable=false)
	private Pelicula pelicula;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_formato", nullable=false)
	private Formato formato;

	public FormatoPelicula(int id, Pelicula pelicula, Formato formato) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.formato = formato;
	}
	
	public FormatoPelicula(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}
}
