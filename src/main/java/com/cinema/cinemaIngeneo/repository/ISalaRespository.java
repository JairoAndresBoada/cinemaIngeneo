package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sala;

public interface ISalaRespository {
	
	void saveSala(Sala sala) throws CinemaException;
	List<Sala> listarSalas() throws CinemaException;	
}
