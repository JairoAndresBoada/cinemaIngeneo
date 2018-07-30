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

import com.cinema.cinemaIngeneo.modelo.Funcion;
import com.cinema.cinemaIngeneo.modelo.Reserva;
import com.cinema.cinemaIngeneo.modelo.SillasFila;

@SuppressWarnings("serial")
@Entity
@Table(name="funcion_silla")
public class FuncionSilla implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_silla_fila", nullable=false)
	private SillasFila sillafila;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_funcion", nullable=false)
	private Funcion funcion;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_reserva", nullable=false)
	private Reserva reserva;

	public FuncionSilla(int id, SillasFila sillafila, Funcion funcion, Reserva reserva) {
		super();
		this.id = id;
		this.sillafila = sillafila;
		this.funcion = funcion;
		this.reserva = reserva;
	}
	
	public FuncionSilla(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SillasFila getSillafila() {
		return sillafila;
	}

	public void setSillafila(SillasFila sillafila) {
		this.sillafila = sillafila;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
}
