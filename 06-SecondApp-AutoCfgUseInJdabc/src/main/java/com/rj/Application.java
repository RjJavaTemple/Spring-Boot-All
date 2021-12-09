package com.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rj.dao.ConnectionDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Prepare the IOC Container
		ApplicationContext actx = SpringApplication.run(Application.class, args);
		// Add The Dao Class
		ConnectionDao dao = actx.getBean("connectionDao", ConnectionDao.class);
		//
		try {
			System.out.println("The Data Are"+dao.getCountData());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
