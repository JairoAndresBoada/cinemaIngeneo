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

import com.cinema.cinemaIngeneo.modelo.FuncionSilla;
import com.cinema.cinemaIngeneo.modelo.SalaFormatos;
import com.cinema.cinemaIngeneo.modelo.SucursalPelicula;

@SuppressWarnings("serial")
@Entity
@Table(name ="funcion")
public class Funcion implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFuncion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sucursal_pelicula", nullable=false)
	private SucursalPelicula sucursalpelicula;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sala_formato", nullable=false)
	private SalaFormatos salaformato;

	@OneToMany(mappedBy = "funcion")
	private List<FuncionSilla> funcionsilla = new ArrayList<FuncionSilla>();

	public Funcion(int idFuncion, SucursalPelicula sucursalpelicula, SalaFormatos salaformato,
			List<FuncionSilla> funcionsilla) {
		super();
		this.idFuncion = idFuncion;
		this.sucursalpelicula = sucursalpelicula;
		this.salaformato = salaformato;
		this.funcionsilla = funcionsilla;
	}

	public Funcion(){}

	public int getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public SucursalPelicula getSucursalpelicula() {
		return sucursalpelicula;
	}

	public void setSucursalpelicula(SucursalPelicula sucursalpelicula) {
		this.sucursalpelicula = sucursalpelicula;
	}

	public SalaFormatos getSalaformato() {
		return salaformato;
	}

	public void setSalaformato(SalaFormatos salaformato) {
		this.salaformato = salaformato;
	}

	public List<FuncionSilla> getFuncionsilla() {
		return funcionsilla;
	}

	public void setFuncionsilla(List<FuncionSilla> funcionsilla) {
		this.funcionsilla = funcionsilla;
	}
		
}
