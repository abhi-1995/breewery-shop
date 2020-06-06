package com.miscroservice.breweeryshop.services;

import java.util.UUID;

import com.miscroservice.breweeryshop.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

}
