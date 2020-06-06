package com.miscroservice.breweeryshop.services;

import java.util.UUID;

import com.miscroservice.breweeryshop.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);
	
}
