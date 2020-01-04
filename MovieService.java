package com.movie.service;

import com.movie.model.Movie;

public interface MovieService {
	Movie getMovieById(int movieId) throws Exception;
    void addMovie(Movie movie) throws Exception;
}
