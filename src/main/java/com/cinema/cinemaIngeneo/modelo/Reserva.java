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

import com.cinema.cinemaIngeneo.modelo.Cliente;
import com.cinema.cinemaIngeneo.modelo.FuncionSilla;
import com.cinema.cinemaIngeneo.modelo.Sala;

@SuppressWarnings("serial")
@Entity
@Table(name ="reserva")
public class Reserva implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReserva;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cliente", nullable=false)
	private Cliente cliente;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sala", nullable=false)
	private Sala sala;
	
	@Column(name="fila")
	private String fila;
	
	@Column(name="silla")
	private String silla;
	@OneToMany(mappedBy = "reserva")
	
	private List<FuncionSilla> funcionsilla = new ArrayList<FuncionSilla>();
	
	public Reserva(int idReserva, Cliente cliente, Sala sala, String fila, String silla,
			List<FuncionSilla> funcionsilla) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.sala = sala;
		this.fila = fila;
		this.silla = silla;
		this.funcionsilla = funcionsilla;
	}
	
	public Reserva(){}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public String getSilla() {
		return silla;
	}

	public void setSilla(String silla) {
		this.silla = silla;
	}

	public List<FuncionSilla> getFuncionsilla() {
		return funcionsilla;
	}

	public void setFuncionsilla(List<FuncionSilla> funcionsilla) {
		this.funcionsilla = funcionsilla;
	}
	
}

