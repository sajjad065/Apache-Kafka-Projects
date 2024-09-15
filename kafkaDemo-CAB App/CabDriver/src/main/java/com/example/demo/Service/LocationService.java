package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

//This class will generate the location in (x, y) coordinate form and send it to kafka
@Configuration
public class LocationService {
	
	@Autowired
	KafkaTemplate<String,String> kt;  //kafka template created
	
	public void getLocation()
	{
		
		int range=0;
		while(range<=20)
			
		{
			
			Double x=Math.random(); //generate random value for x coordinate
			Double y=Math.random(); //generate random value for y coordinate
			String coordinate="(" + x + "," + y + ")";  //merging x and y coordinate
			
			System.out.println("Producer Publishing: " +coordinate); //printing coordinate in console
			
			kt.send("Cab-Location",coordinate); //sending coordinate to kafka system
			
			
			//using try - catch inorder to handle possible exeception
			
			try {
				Thread.sleep(1000);   //put the current thread in pause mode before sending next output to kafka
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
				     
		     
		     
		}
		
	}

}
