package com.scomm.movie.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException {
	
    private static final long serialVersionUID = 1L;
 
    public MovieNotFoundException() {
        super("Movie not found");
    }
	 
}