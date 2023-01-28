package com.rose.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//dara access layer talks with database
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //finding mobie by imdbid instead of objectid
     Optional<Movie> findMovieByImdbId(String imdbId);
}
