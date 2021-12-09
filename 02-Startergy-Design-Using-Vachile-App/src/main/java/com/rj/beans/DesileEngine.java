package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desile")
@Primary
public class DesileEngine implements Engine {

	public DesileEngine() {
		System.out.println("DesileEngine.DesileEngine()");
	}

	@Override
	public void StartCar() {
		System.out.println("DesileEngine.StartCar()");

	}

	@Override
	public void StopCar() {
		System.out.println("DesileEngine.StopCar()");

	}
}
