package com.rj.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rj.beans.MianSchoolClass;
import com.rj.cfgs.Configureclass;

public class MainClientClass {

	public static void main(String[] args) {
		//Craete The Ioc Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Configureclass.class);
		System.out.println("     ");
		//Add The Class Object
		MianSchoolClass school=ctx.getBean("schclass",MianSchoolClass.class);
		school.SchoolTeacherTimeTable("Ranjan", LocalDateTime.now());
	}
	
}
