package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.data.Movie;
import com.example.service.MovieService;

@RestController
@RequestMapping("/Movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.create(movie);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> getAllMovies(){
		return movieService.read();
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieService.update(movie);
	}

	@DeleteMapping("/{id}")
	public String deleteMovie(@PathVariable String id) {
		return movieService.delete(id);
	}
}
