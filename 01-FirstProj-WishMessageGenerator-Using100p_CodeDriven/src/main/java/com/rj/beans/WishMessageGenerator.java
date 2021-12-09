package com.rj.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	// Add The Has-A Property
	@Autowired
	private LocalDateTime LDT;

	// Create The 0-Parms Constructure
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-Parms Constructure");
	}

	public String WishMessageGen(String user) {
		// Get The Hour

		int Hour = LDT.getHour();
		if (Hour < 12)
			return "Good Morning ::  " + user;
		if (Hour < 16)
			return "Good Afternoon  ::  " + user;
		if (Hour < 20)
			return "Good Evening  ::  " + user;
		else
			return "Good Night  ::  " + user;
	}

}
