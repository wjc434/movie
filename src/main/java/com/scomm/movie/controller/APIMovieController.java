package com.scomm.movie.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scomm.movie.exceptions.GeneralException;
import com.scomm.movie.exceptions.MovieNotFoundException;
import com.scomm.movie.model.Movie;
import com.scomm.movie.repository.MovieRepository;

@RestController
@RequestMapping("movies")
public class APIMovieController {
	private final MovieRepository repository;
	 
	public APIMovieController(MovieRepository repository) {
	    this.repository = repository;
	}
	
	@GetMapping
	public Iterable<Movie> getMovies() {
	    return repository.findAll();
	}  
	
	@GetMapping("{id}")
	public Movie getMovie(@PathVariable Long id) {
	    return repository.findById(id).orElseThrow(MovieNotFoundException::new);
	}
	
	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		
		if(movie.getRating() < 0.5 || movie.getRating() > 5) 
	    	throw new GeneralException("Invalid Rating Input");
	    	
		if(movie.getCategory().equals(null) || movie.getCategory().equals(""))
			throw new GeneralException("Invalid Category");
	    	
		if(movie.getTitle().equals(null) || movie.getTitle().equals(""))
			throw new GeneralException("Invalid Title");
		
	    return repository.save(movie);
	}
	
	@PutMapping("{id}")
	public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
	    Movie movieToUpdate = repository.findById(id).orElseThrow(MovieNotFoundException::new);
	    
	    if(movie.getRating() < 0.5 || movie.getRating() > 5) {
	    	throw new GeneralException("Invalid Rating Input");
	    }	    
	    
	    movieToUpdate.setRating(movie.getRating());
	    
	    return repository.save(movieToUpdate);
	}   
	
	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable Long id) {
	    repository.findById(id).orElseThrow(MovieNotFoundException::new);
	    repository.deleteById(id);
	}
}