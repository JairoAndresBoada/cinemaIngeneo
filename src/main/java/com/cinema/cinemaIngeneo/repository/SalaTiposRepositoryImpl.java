package com.cinema.cinemaIngeneo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Formato;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@Transactional
@Repository
public class SalaTiposRepositoryImpl implements ISalasTiposRepository {
	
	
	/*private Session getSession(){
	return em.unwrap(Session.class);
	}*/
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void crearTipoSala(Formato foramtosala) throws CinemaException {
		try {
			em.persist(foramtosala);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_INSERTAR_TIPO_SALA,e);
		}			
	}

	@Override
	public List<Formato> listarSalaTipos() throws CinemaException {
		try {
			@SuppressWarnings("unchecked")
			List<Formato> resp = (List<Formato>)em.createQuery("select id,nombre from Formato").getResultList();
			// return getSession().createCriteria(Sala.class).list();
			return(resp);
		
		}catch(Exception e) {
			throw new CinemaException(ConstanteServices.ERROR_BUSCAR_SALA_TIPO,e);
		}	
		
	}
}
