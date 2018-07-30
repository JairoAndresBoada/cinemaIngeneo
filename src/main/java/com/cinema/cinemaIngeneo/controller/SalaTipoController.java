package com.cinema.cinemaIngeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinemaIngeneo.modelo.Formato;
import com.cinema.cinemaIngeneo.services.ISalaTiposServices;

@RestController
@RequestMapping("/salatipo")
public class SalaTipoController {
	
	@Autowired
	ISalaTiposServices salatiposervices;
	
	@CrossOrigin
    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crearSucursal(@RequestBody Formato formatosala) {
		salatiposervices.crearTipoSala(formatosala);
		return new ResponseEntity<String>("Se creo el Tipo de Sala", HttpStatus.OK);
	}
	
	@CrossOrigin
    //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Formato>> verSalaTipo() {
		return (new ResponseEntity<>(salatiposervices.listarSalaTipo(), HttpStatus.OK));
	}
	
}
