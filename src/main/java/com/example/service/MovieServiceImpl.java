package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.data.Movie;
import com.example.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	@Override
	public Movie create(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.insert(movie);
	}

	@Override
	public List<Movie> read() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.save(movie);
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
		return "Record is deleted";
	}

}
