package com.cinema.cinemaIngeneo.services;

import java.util.List;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sala;


public interface ISalaServices {
	
	void crearSala(Sala sala) throws CinemaException;
	List<Sala>listarSalas();

}
