package com.miscroservice.breweeryshop.web.controller;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping
	public ResponseEntity handlePost(BeerDto beerDto) {
		BeerDto savedDto = beerService.saveNewBeer(beerDto);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "http://localhost:8080/api/v1/beer/"+savedDto.getId().toString());
		
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

}
