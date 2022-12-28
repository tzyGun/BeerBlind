package com.tzygun.BeerBlind.domain.beer.controller;


import com.tzygun.BeerBlind.domain.beer.dto.Beer;
import com.tzygun.BeerBlind.domain.beer.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class BeerController {

    private final BeerService beerService;

    @PostMapping("/beer")
    public Mono<Beer> addBeer(@RequestBody Beer beer) {
        return beerService.addBeer(beer)
                .doFirst(()->log.info("Adding beer to DB {}", beer));
    }

}
