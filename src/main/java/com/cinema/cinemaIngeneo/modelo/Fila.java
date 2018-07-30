package com.cinema.cinemaIngeneo.modelo;

import java.io.Serializable;
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

import com.cinema.cinemaIngeneo.modelo.Sala;
import com.cinema.cinemaIngeneo.modelo.SillasFila;

@SuppressWarnings("serial")
@Entity
@Table(name = "fila")
public class Fila implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="letra")
	private String letra;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_sala", nullable=false)
	private Sala sala;
	
	@OneToMany(mappedBy = "fila")
    private List<SillasFila> sillafila;
	
	
	
	public Fila() {
		super();
	}

	public Fila(String letra, List<SillasFila> sillafila) {
		super();
		this.letra = letra;
		this.sillafila = sillafila;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public List<SillasFila> getSillafila() {
		return sillafila;
	}

	public void setSillafila(List<SillasFila> sillafila) {
		this.sillafila = sillafila;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
