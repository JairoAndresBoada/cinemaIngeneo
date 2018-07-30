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

import com.cinema.cinemaIngeneo.exception.CinemaException;
import com.cinema.cinemaIngeneo.modelo.Sala;
import com.cinema.cinemaIngeneo.services.ISalaServices;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	ISalaServices salaservices;
	
	@CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crearSala(@RequestBody Sala sala)  {
		try {
			salaservices.crearSala(sala);
			return new ResponseEntity<String>("Sala creada", HttpStatus.OK);
		} catch (CinemaException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin
    //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Sala>> verSala() {
		return (new ResponseEntity<>(salaservices.listarSalas(), HttpStatus.OK));
	}	
	
}
