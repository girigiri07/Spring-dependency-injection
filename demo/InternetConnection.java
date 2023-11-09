package com.example.demo;

import org.springframework.stereotype.Component;

@Component("abc")
//entha mari naraya container erutha antha container ku name vachu antha container ah  call panum pothu
//qualifer la antha name podanum
public class InternetConnection {
	private String ipaddress;
	private int speed;
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void switchon() {
		System.out.println("switching on internet");
	}
}
