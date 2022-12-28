package com.tzygun.BeerBlind.domain.beer.service;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepositoryInMemory beerRepository;

    @Override
    public Mono<Beer> addBeer(Beer beer) {
        return beerRepository
                .save(beer);
    }

    @Override
    public Mono<List<Beer>> getBeers() {
        return beerRepository.getBeers();
    }
}
