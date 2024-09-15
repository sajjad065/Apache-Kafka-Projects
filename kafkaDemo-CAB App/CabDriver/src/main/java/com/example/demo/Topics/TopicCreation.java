package com.example.demo.Topics;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


//here we create  a topic 
//Producer will publish a message in the given topic
@Configuration
public class TopicCreation {

	    @Bean
	    NewTopic topic()
		{
			System.out.println("Topics created");
			
			return TopicBuilder.name("Cab-Location").build();
		}
		
	


}
