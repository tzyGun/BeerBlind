package com.tzygun.BeerBlind.domain.beer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("beer")
public class BeerEntity {
    @Id
    @Column("id")
    private UUID id;

    @Column("name")
    private String name;

    @Column("vote")
    private Double vote;

}