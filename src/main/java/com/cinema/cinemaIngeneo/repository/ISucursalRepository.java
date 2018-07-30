package com.cinema.cinemaIngeneo.repository;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sucursal;

public interface ISucursalRepository {
	
	void saveSucursal(Sucursal sucursal) throws CinemaException;
}
