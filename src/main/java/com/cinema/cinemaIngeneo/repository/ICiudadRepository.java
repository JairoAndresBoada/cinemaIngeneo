package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Ciudad;


public interface ICiudadRepository {
	
	List<Ciudad> listarCiudad() throws CinemaException;

}
