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

import com.cinema.cinemaIngeneo.modelo.Formato;
import com.cinema.cinemaIngeneo.modelo.Funcion;
import com.cinema.cinemaIngeneo.modelo.Sala;

@SuppressWarnings("serial")
@Entity 
@Table(name="sala_formato")
public class SalaFormatos implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_formato", nullable=false)
	private Formato formato;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sala", nullable=false)
	private Sala sala;
	
	@OneToMany(mappedBy = "salaformato")
	private List<Funcion> funciones = new ArrayList<Funcion>();

	public SalaFormatos(int id, Formato formato, Sala sala, List<Funcion> funciones) {
		super();
		this.id = id;
		this.formato = formato;
		this.sala = sala;
		this.funciones = funciones;
	}
	
	public SalaFormatos(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
	
}

