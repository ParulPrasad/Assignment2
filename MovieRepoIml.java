package com.movie.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.movie.model.Movie;

public class MovieRepoIml implements MovieRepo{
	
   
    Movie m1=new Movie(101,"aaa","1/1/20","9:00am","available");
    Movie m2=new Movie(102,"bbb","12/1/20","1:00pm","not available");
    List<Movie> movieList=new ArrayList();
    
   
	@Override
	public Movie getMovieById(int movieId) throws Exception {
		movieList.add(m1);
		movieList.add(m2);
		for(Movie obj:movieList) {
			if(obj.getMovieId()==movieId) 
				return obj;
			
		}
		
		return null;
	}

	@Override
	public void addMovie(Movie movie) throws Exception {
		movieList.add(movie);
		System.out.println("added...");
	}

}
