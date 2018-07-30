package com.cinema.cinemaIngeneo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sucursal;
import com.cinema.cinemaIngeneo.repository.ISucursalRepository;

@Transactional
@Service
public class SucursalServicesImpl implements ISucursalServices {
	@Autowired
	ISucursalRepository sucursalRepository;
	
	@Override
	public void crearSucursal(Sucursal sucursal) {
		try {
			sucursalRepository.saveSucursal(sucursal);
		} catch (CinemaException e) {
			
		}
	}
}
