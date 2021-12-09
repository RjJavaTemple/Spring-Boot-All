package com.rj.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.rj")
@ImportResource("com/rj/cfgs/application.xml")
public class Configureclass {

	public Configureclass() {
		System.out.println("Configureclass.Configureclass()");
	}

}
