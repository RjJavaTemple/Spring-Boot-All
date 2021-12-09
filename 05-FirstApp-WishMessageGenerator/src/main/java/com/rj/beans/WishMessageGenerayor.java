package com.rj.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerayor {

	// Craete The Private Has-A Property In The Data Class
	@Autowired
	private LocalDateTime ldt;

	public String WishMethodApp(String Name) {
		// Convert Into The Hour
		int Hour = ldt.getHour();
		if (Hour < 12)
			return "Good Morning......!!" + Name;
		else if (Hour < 16)
			return "Good Afternoon......!!" + Name;
		else if (Hour < 20)
			return "Good Evening......!!" + Name;
		else
			return "Good Night........!!" + Name;
	}

}
