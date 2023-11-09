package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(value="prototype")
//namaku erundu object create pani two times pananum construtor call pananum ma apo entha mari 
//tha pananum athuku name prototype


@Component
//entha mari componet kudutha spring boot ku oru container erukum anga save agum entha class oda object

public class Home {
	
	//POJO CLASS
	
	public Home() {
		System.out.println("home home");
	}
	
	private String owner;
	private int doorno;
	private String getowner ;
	
	@Autowired
	//autowired just enga container eruko anga pogum qualifer la ena name container eruko anga pogum
	@Qualifier("abc")
	//oru oru container yum call panum pothu entha qualifer vachu antha container ah call panna mudiyum
	private  InternetConnection modem;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getGetowner() {
		return getowner;
	}
	public void setGetowner(String getowner) {
		this.getowner = getowner;
	}
	

	public void connect() {
		modem.switchon();
		System.out.println("conneecting to internet");
	}
}
