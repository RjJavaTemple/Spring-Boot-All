package com.rj.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class WishaMessageGenerator_CfgClass {

	public WishaMessageGenerator_CfgClass() {
		System.out.println("WishaMessageGenerator_CfgClass.WishaMessageGenerator_CfgClass()");
	}

	@Bean(name = "Localdatetime")
	public LocalDateTime CreateLDT() {
		System.out.println("WishaMessageGenerator_CfgClass.CreateLDT()");
		return LocalDateTime.now();
	}
}
