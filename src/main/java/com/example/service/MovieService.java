package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.data.Movie;


@Service
public interface MovieService {

	Movie create(Movie movie);
	List<Movie> read();
	Movie update(Movie movie);
	String delete(String id);
	
	
}
