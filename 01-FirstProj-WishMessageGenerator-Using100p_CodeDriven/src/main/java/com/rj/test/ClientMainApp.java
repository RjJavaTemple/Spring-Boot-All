package com.rj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rj.beans.WishMessageGenerator;
import com.rj.cfg.WishaMessageGenerator_CfgClass;

public class ClientMainApp {

	public static void main(String[] args) {
		// Create The Ioc Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				WishaMessageGenerator_CfgClass.class);
		// Create The Target Class Object
		WishMessageGenerator gen = ctx.getBean("wmg", WishMessageGenerator.class);
		// Add The Method
		String Result = gen.WishMessageGen("Ranjan");
		System.out.println("Plz See The Message That Are Generate For You..........!!!");
		System.out.println(Result);
	}

}
