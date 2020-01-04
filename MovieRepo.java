package com.movie.repo;

import com.movie.model.Movie;

public interface MovieRepo {
	
    void addMovie(Movie movie) throws Exception;
	Movie getMovieById(int movieId) throws Exception;
	
}
