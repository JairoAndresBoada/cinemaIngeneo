package com.cinema.cinemaIngeneo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sala;
import com.cinema.cinemaIngeneo.repository.ISalaRespository;
import com.cinema.cinemaIngeneo.util.ConstanteServices;

@Transactional
@Service
public class SalaServicesImpl implements ISalaServices {

	@Autowired
	ISalaRespository salarespository;

	@Override
	public void crearSala(Sala sala) throws CinemaException {

		// validar que tenga 3..27 filas
		if (sala.getFila().size() < ConstanteServices.MIN_FILAS || sala.getFila().size() > ConstanteServices.MAX_FILAS) {
			throw new CinemaException(ConstanteServices.ERROR_TAMANO_NUMERO_FILAS, null);
		}
		// validar que cada fila tenga 3..10 sillas.
		if (!sala.validarSillasFila()) {
			throw new CinemaException(ConstanteServices.ERROR_TAMANO_NUMERO_SILLAS, null);
		}

		sala.asociateSala();
		salarespository.saveSala(sala);

	}

	@Override
	public List<Sala> listarSalas() {
		try {
			return (salarespository.listarSalas());

		} catch (CinemaException e) {
			return (null);
		}
	}


}
