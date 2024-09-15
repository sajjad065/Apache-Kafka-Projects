package com.example.demo.Listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//Main consumer logic
//This class will listen to the kafka's topic (Cab-Location) and print out the message in console

@Service
public class Listener {
	
	
	@KafkaListener(topics="Cab-Location" , groupId="abc")
	public void getDriverLocation(String coordinate)
	{
	
		System.out.println("Consumer Side" +coordinate); //location print-out in console
		
	}
	
	

}
