package com.rj.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("schclass")
public class MianSchoolClass {

	// Add the Has-A Property
	@Autowired
	@Qualifier("Wschoolclass")
	private SchoolClass scoclass;

	public MianSchoolClass() {
		System.out.println("MianSchoolClass.MianSchoolClass()");
	}

	// Add The b Logic method
	public void SchoolTeacherTimeTable(String Teachername, LocalDateTime datetime) {
		System.out.println("MianSchoolClass.SchoolTeacherTimeTable()");
		scoclass.ClassStart();
		System.out.println("The Class Is Start All Are Please Come");
		System.out.println("Your Teacher Name is::" + Teachername);
		System.out.println("The Time Are ::" + datetime);
		scoclass.ClassEnd();
		System.out.println("Safely Return The Home...!!");

	}

}
