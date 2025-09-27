package com.factorypattern.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {

	@GetMapping("")
	public ResponseEntity<String> getAnimals(){
		return new ResponseEntity<String>("got anmials", HttpStatus.OK);
	}
}
