package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
import com.cinema.cinemaIngeneo.modelo.SalaFormatos;
import com.cinema.cinemaIngeneo.modelo.Sucursal;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@SuppressWarnings("serial")
@Entity
@Table(name="sala")
public class Sala implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_sucursal", nullable=false)
	private Sucursal sucursal;
	
	@Column(name="numero_filas")
	private String numero_filas;	
	
	@OneToMany(mappedBy = "sala")
    private List<SalaFormatos> salaFormato ;
	
	@OneToMany(mappedBy = "sala",cascade = CascadeType.ALL)
    private List<Fila> fila ;
	
	public Sala(int id, Sucursal sucursal, String tipo_sala, String numero_filas) {
		super();
		this.id = id;
		this.sucursal = sucursal;
		this.numero_filas = numero_filas;
		this.salaFormato = new ArrayList<>();
		this.fila = new ArrayList<>();
	}

	public List<SalaFormatos> getSalaFormato() {
		return salaFormato;
	}

	public void setSalaFormato(List<SalaFormatos> salaFormato) {
		this.salaFormato = salaFormato;
	}

	public List<Fila> getFila() {
		return fila;
	}
	
	public void setFila(List<Fila> fila) {
		this.fila = fila;
	}

	public Sala(){}

	public int getId() {
		return id;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String getNumero_filas() {
		return numero_filas;
	}

	public void setNumero_filas(String numero_filas) {
		this.numero_filas = numero_filas;
	}
	
	public void asociateSala(){
		for(Fila sf : this.fila){
			sf.setSala(this);
		}
			
	}

	public boolean validarSillasFila() {
		for(Fila sf : this.fila){
			if(sf.getSillafila().size() < ConstanteServices.MIN_SILLAS || sf.getSillafila().size() > ConstanteServices.MAX_SILLAS)
				return false;
		}
		return true;
	}
	
}
