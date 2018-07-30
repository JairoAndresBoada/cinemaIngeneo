package com.cinema.cinemaIngeneo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Formato;
import com.cinema.cinemaIngeneo.repository.ISalasTiposRepository;

@Transactional
@Service
public class SalaTiposServicesImpl implements ISalaTiposServices {
	
	
	@Autowired
	ISalasTiposRepository salatiporespository;
	
	@Override
	public void crearTipoSala(Formato formatosala) {
		try {
			salatiporespository.crearTipoSala(formatosala);
		} catch (CinemaException e) {
			
		}		
	}

	@Override
	public List<Formato> listarSalaTipo() {
		try {
			return (salatiporespository.listarSalaTipos());

		} catch (CinemaException e) {
			return (null);
		}
	}

}
