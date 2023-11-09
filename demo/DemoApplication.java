package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);
	
	
	//configurableaplicationcontext na namba already create pani ellla value yum insert  pani vachathu ella
	//configure pani run panum
		
		Home h=context.getBean(Home.class);
		h.connect();
		//bean of spring
		
		
		
		
		//Home h1=context.getBean(Home.class);
		//h1.connect(); 
		//theva ilatha object la eduthukathu
		//ethuku name Singleton scope
	
	
	}

}
