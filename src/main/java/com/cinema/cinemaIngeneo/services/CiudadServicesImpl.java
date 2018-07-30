package com.cinema.cinemaIngeneo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Ciudad;
import com.cinema.cinemaIngeneo.repository.ICiudadRepository;


@Transactional
@Service
public class CiudadServicesImpl implements ICiudadServices {
	

	@Autowired
	ICiudadRepository ciudadrespository;

	@Override
	public List<Ciudad> listarCiudad() {
		try {
			return (ciudadrespository.listarCiudad());

		} catch (CinemaException e) {
			return (null);
		
		 }

	}
}