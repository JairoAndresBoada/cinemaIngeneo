package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Ciudad;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@Transactional
@Repository
public class CiudadRepositoryImpl implements ICiudadRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Ciudad> listarCiudad() throws CinemaException {
		try {
			@SuppressWarnings("unchecked")
			List<Ciudad> resp = (List<Ciudad>)em.createQuery("select id,nombre from Ciudad").getResultList();
			// return getSession().createCriteria(Sala.class).list();
			return(resp);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_BUSCAR_CIUDAD,e);
		}	
	}

}
