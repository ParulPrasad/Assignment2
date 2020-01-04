package com.movie.application;
import java.util.*;

import com.movie.model.Movie;
import com.movie.service.MovieService;
import com.movie.service.MovieServiceImpl;

public class MovieApp {

	public static void main(String[] args) throws Exception {
		MovieService service=new MovieServiceImpl();
		Movie m=new Movie();
		//List<Movie> mList=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		//System.out.println("1->add movie\n2->movie details");
		//int c=in.nextInt();
		
			System.out.println("enter id,name,show date,show time,status:");
			int id=in.nextInt();
			String name=in.next();
			String date=in.next();
			String time=in.next();
			String status=in.next();
			//Movie m=new Movie(id,name,date,time,status);
			int i=0;
			while(i<2) {
				m.setMovieId(in.nextInt());
				m.setMovieName(in.next());
				m.setShowDate(in.next());
				m.setShowTime(in.next());
				m.setStatus(in.next());
				i++;
			}
			service.addMovie(m);
			System.out.println(m);
		    
	
		System.out.println("Enter Movie Id:");
		int movieId=in.nextInt();
		m=service.getMovieById(movieId);
		if(m!=null)
		System.out.println(m);
		else	
			System.out.println("invaild id");
		
		
	}	

}
