package com.movie.service;

import com.movie.model.Movie;
import com.movie.repo.MovieRepo;
import com.movie.repo.MovieRepoIml;

public class MovieServiceImpl implements MovieService{
	MovieRepo repo=new MovieRepoIml();

	@Override
	public Movie getMovieById(int movieId) throws Exception {
		return repo.getMovieById(movieId);
	}

	@Override
	public void addMovie(Movie movie) throws Exception {
		repo.addMovie(movie);
		
	}
	

}
