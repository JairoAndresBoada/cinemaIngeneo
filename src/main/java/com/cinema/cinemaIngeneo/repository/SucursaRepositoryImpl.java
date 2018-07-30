package com.cinema.cinemaIngeneo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sucursal;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@Transactional
@Service
public class SucursaRepositoryImpl implements ISucursalRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveSucursal(Sucursal sucursal) throws CinemaException {
		try {
			em.persist(sucursal);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_INSERTAR_SUCURSAL,e);
		}
	}

}
