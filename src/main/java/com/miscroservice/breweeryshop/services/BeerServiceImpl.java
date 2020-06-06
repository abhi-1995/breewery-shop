package com.miscroservice.breweeryshop.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.miscroservice.breweeryshop.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

}
