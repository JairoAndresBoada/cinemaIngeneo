package com.cinema.cinemaIngeneo.exception;

@SuppressWarnings("serial")
public class CinemaException extends Exception {
	public CinemaException() {
		super();
	}
	public CinemaException(String mensaje, Throwable e) {
      super(mensaje, e);
	}


}
