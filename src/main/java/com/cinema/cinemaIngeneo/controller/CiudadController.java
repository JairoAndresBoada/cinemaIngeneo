package com.cinema.cinemaIngeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinemaIngeneo.modelo.Ciudad;
import com.cinema.cinemaIngeneo.services.ICiudadServices;


@RestController
@RequestMapping("/ciudad")
public class CiudadController {
	
	@Autowired
	ICiudadServices ciudadservices;
	
	
	@CrossOrigin
    //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ciudad>> verCiudad() {
		return (new ResponseEntity<>(ciudadservices.listarCiudad(), HttpStatus.OK));
	}

}
