package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sala;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@Transactional
@Repository
public class SalaRepositoryImpl implements ISalaRespository {
	
	@PersistenceContext
	private EntityManager em;
	

	/*private Session getSession(){
		return em.unwrap(Session.class);
	}*/
	
	@Override
	public void saveSala(Sala sala) throws CinemaException {		
		try {
			em.persist(sala);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_INSERTAR_SALA,e);
		}		
	}


	@Override
	public List<Sala> listarSalas() throws CinemaException {
		try {
			@SuppressWarnings("unchecked")
			List<Sala> resp = (List<Sala>)em.createQuery("select id,sucursal.id,numero_filas from Sala").getResultList();
			// return getSession().createCriteria(Sala.class).list();
			return(resp);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_BUSCAR_SALA,e);
		}	
		
	}
	
}
