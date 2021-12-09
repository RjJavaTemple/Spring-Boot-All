package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cng")
@Primary
public class CngEngine implements Engine {

	public CngEngine() {
		System.out.println("CngEngine.CngEngine()");
	}

	@Override
	public void StartCar() {
		System.out.println("CngEngine.StartCar()");

	}

	@Override
	public void StopCar() {
		System.out.println("CngEngine.StopCar()");

	}
}
