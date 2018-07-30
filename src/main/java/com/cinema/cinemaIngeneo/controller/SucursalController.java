package com.cinema.cinemaIngeneo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cinema.cinemaIngeneo.modelo.Sucursal;
import com.cinema.cinemaIngeneo.services.ISucursalServices;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
	
	@Autowired
	ISucursalServices sucursalServices;
	
	@CrossOrigin
    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearSucursal(@RequestBody Sucursal sucursal) {
		sucursalServices.crearSucursal(sucursal);
	}
}
