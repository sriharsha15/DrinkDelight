package com.capgemini.drinkanddelight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinkanddelight.entity.Distributor;
import com.capgemini.drinkanddelight.exception.DistributorException;
import com.capgemini.drinkanddelight.service.DistributorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
	
public class DistributorController 
{
	@Autowired
	private DistributorService distributorservice;

	@PostMapping("/distributor")
	public ResponseEntity<Distributor> saveDistributor(@RequestBody Distributor distributor) {

		Distributor dist = distributorservice.create(distributor);

		return new ResponseEntity<Distributor>(dist, HttpStatus.OK);
	}

	@GetMapping("/getdistributor/{id}")
	public ResponseEntity<String> getDistributor(@PathVariable("id") String distributorId) {
		String status = distributorservice.display(distributorId);
		//if(!status)throw new DistributorException("Distributor not found.");
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	@GetMapping("/getdistributor")
	public ResponseEntity<List<Distributor>> getAllDistributors( ) {
		List<Distributor> dist = distributorservice.displayAll();
		return new ResponseEntity<List<Distributor>>(dist, HttpStatus.OK);
	}

}
