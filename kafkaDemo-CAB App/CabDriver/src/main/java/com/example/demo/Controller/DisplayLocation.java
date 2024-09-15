package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LocationService;


//end point of api is defined in this class.
//whenever user hit /location, user will receive data from LocationService class

@RestController
public class DisplayLocation {
	
	@Autowired
	LocationService locationService;
	
	
	
	@GetMapping("/location")
	public void getLocation()
	{
		
		
		locationService.getLocation(); //getLocation method of LocationService class is called
		
		
		
	}

}
