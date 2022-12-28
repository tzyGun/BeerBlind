package com.tzygun.BeerBlind.domain.beer.repository;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import com.tzygun.BeerBlind.domain.beer.service.BeerRepositoryInMemory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class BeerRepositoryInMemoryImpl implements BeerRepositoryInMemory {

    private final Map<Long, Beer> beerDb;
    private final AtomicLong id = new AtomicLong(0L);

    public BeerRepositoryInMemoryImpl() {
        this.beerDb = new HashMap<>();
    }

    @Override
    public Mono<Beer> save(Beer beer) {
        return Mono.fromSupplier(() -> beerDb.put(id.incrementAndGet(), beer));
    }

    @Override
    public Mono<List<Beer>> getBeers() {
        return Mono.fromSupplier(() -> beerDb.values().stream().toList());
    }
}
