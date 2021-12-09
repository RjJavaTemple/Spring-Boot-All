package com.rj.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rj")
public class VachileConfigClass {

	public VachileConfigClass() {
	System.out.println("VachileConfigClass.VachileConfigClass()");
	}
	
}
