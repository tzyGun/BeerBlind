package com.tzygun.BeerBlind.domain.beer.repository;

import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends ReactiveCrudRepository<Beer, Long> {
}
