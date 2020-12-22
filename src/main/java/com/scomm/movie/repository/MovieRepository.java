package com.scomm.movie.repository;

import org.springframework.data.repository.CrudRepository;

import com.scomm.movie.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	
}
