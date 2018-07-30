package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Formato;

public interface ISalasTiposRepository {
	
	void crearTipoSala(Formato formatosala) throws CinemaException;
	List<Formato> listarSalaTipos() throws CinemaException;

}
