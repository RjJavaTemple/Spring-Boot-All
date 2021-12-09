package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("classii")
@Primary
public class Class_II implements SchoolClass {

	public Class_II() {
		System.out.println("Class_II.Class_II(-)");
	}

	@Override
	public void ClassStart() {
		System.out.println("Class_II.ClassStart()");

	}

	@Override
	public void ClassEnd() {
		// TODO Auto-generated method stub
		System.out.println("Class_II.ClassEnd()");
	}

}
