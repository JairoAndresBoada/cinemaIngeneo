package com.cinema.cinemaIngeneo.util;

import org.springframework.stereotype.Component;

@Component
public final class ConstanteServices {
	
	//Contsantes Servicios CINEMA
	public static final String ERROR_INSERTAR_SUCURSAL="No fue posible insertar la sucursal en la Base de Datos";
	public static final String ERROR_INSERTAR_SALA="No fue posible insertar la Sala en la Base de Datos";
	public static final String ERROR_INSERTAR_TIPO_SALA="No fue posible insertar el tipo de Sala en la Base de Datos";
	public static final String ERROR_BUSCAR_SALA="No fue posible encontrar las Sala en la Base de Datos";
	public static final String ERROR_BUSCAR_CIUDAD="No fue posible encontrar las ciudades en la Base de Datos";
	public static final String ERROR_BUSCAR_SALA_TIPO="No fue posible encontrar los tipos Sala en la Base de Datos";
	
	
	//contantes valors min y max por filas y sillas
	public static final int MIN_FILAS = 3;
	public static final int MAX_FILAS = 27;
	public static final int MIN_SILLAS = 3;
	public static final int MAX_SILLAS = 10;
	
	//contantes de error del servicio de salas
	public static final String ERROR_TAMANO_NUMERO_FILAS="Verificar que el numero de Filas este 3 y 27";
	public static final String ERROR_TAMANO_NUMERO_SILLAS="Verificar que el numero de Sillas este 3 y 10";	
}