package com.rj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VachileMain {

	@Autowired
	@Qualifier("petrol")
	private Engine eng;

	public void JurnyCar(String StartPalce, String Endplace) {

		eng.StartCar();
		System.out.println("The Engile Are Start......!" + StartPalce);
		System.out.println("JHappy Jurny......!");
		eng.StopCar();
		System.out.println("The Engine Are Stope.....!" + Endplace);
		System.out.println("I Hope Your Jurny Is Sucess....!!!");
	}

	public VachileMain() {
		System.out.println("VachileMain::0-Parms Constructure");
	}

}
