package com.tzygun.BeerBlind.domain.beer.service;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BeerService {

    Mono<Beer> addBeer(Beer beer);

    Mono<List<Beer>> getBeers();
}
