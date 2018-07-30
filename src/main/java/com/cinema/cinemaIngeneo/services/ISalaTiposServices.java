package com.cinema.cinemaIngeneo.services;

import java.util.List;

import com.cinema.cinemaIngeneo.modelo.Formato;


public interface ISalaTiposServices {
	
	void crearTipoSala(Formato formatosala);
	List<Formato>listarSalaTipo();

}
