package com.rose.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired

    //instantiate class for us -autowired
//    database accces methods
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }
    //may return null optioal

    //find by objectid
//    public Optional< Movie > singleMovie( ObjectId id){
//        return  movieRepository.findById(id);
//    }
    //find by Imdbid
    public Optional<Movie> singleMovie(String imdbId){
        return  movieRepository.findMovieByImdbId(imdbId);
    }
}
