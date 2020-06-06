package com.miscroservice.breweeryshop.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miscroservice.breweeryshop.services.BeerService;
import com.miscroservice.breweeryshop.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	private BeerService beerService;
	
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){
		
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
	}

}
