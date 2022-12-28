package com.tzygun.BeerBlind.domain.beer.service;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BeerRepositoryInMemory {

    Mono<Beer> save(Beer beer);

    Mono<List<Beer>> getBeers();
}
