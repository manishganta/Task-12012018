package com.manish.reactive.repository;

import com.mkyong.reactive.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
