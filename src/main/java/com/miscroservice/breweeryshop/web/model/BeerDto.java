package com.miscroservice.breweeryshop.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BeerDto {
	
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;

}
