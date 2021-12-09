package com.rj;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rj.beans.WishMessageGenerayor;

@SpringBootApplication
public class Application {

	// Craete The Date Time Method
	@Bean
	public LocalDateTime LocaldtMethod() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// Add The Business Method
		WishMessageGenerayor gen = ctx.getBean("wishMessageGenerayor", WishMessageGenerayor.class);
		String Res = gen.WishMethodApp("Ranjan");
		System.out.println(Res);
		// Close The ApplicationContex
	}
}
