package com.tzygun.BeerBlind.domain.beer.controller;


import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import com.tzygun.BeerBlind.domain.beer.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class BeerController {

    private final BeerService beerService;

    @PostMapping("/beer")
    public Mono<Beer> addBeer(@RequestBody Beer beer) {
        return beerService.addBeer(beer)
                .doFirst(() -> log.info("Adding beer to DB {}", beer));
    }

    @GetMapping("/beers")
    public Mono<List<Beer>> getBeers() {
        return beerService.getBeers();
    }

}
