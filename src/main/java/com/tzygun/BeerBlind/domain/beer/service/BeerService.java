package com.tzygun.BeerBlind.domain.beer.service;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<Beer> addBeer(Beer beer);
}
