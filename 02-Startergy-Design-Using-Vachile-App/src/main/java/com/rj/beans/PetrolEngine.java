package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
@Primary
public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void StartCar() {
		System.out.println("PetrolEngine.StartCar()");

	}

	@Override
	public void StopCar() {
		System.out.println("PetrolEngine.StopCar()");

	}
}
