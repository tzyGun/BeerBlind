package com.tzygun.BeerBlind.domain.beer.service;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import com.tzygun.BeerBlind.domain.beer.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    @Override
    public Mono<Beer> addBeer(Beer beer) {
//        Mono<Beer> save = beerRepository.save(beer);
        return Mono.fromSupplier(()-> beer);
    }
}
