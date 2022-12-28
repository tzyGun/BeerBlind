package com.tzygun.BeerBlind.domain.beer.dto;

import lombok.Builder;

@Builder
public record Beer(String name,
                   Double vote) {
}
