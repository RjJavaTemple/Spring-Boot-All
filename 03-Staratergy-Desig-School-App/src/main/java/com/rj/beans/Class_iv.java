package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("classiv")
@Primary
public class Class_iv implements SchoolClass {

	public Class_iv() {
		System.out.println("Class_iv.Class_iv()");
	}

	@Override
	public void ClassStart() {
		System.out.println("Class_iv.ClassStart()");
	}

	@Override
	public void ClassEnd() {
		System.out.println("Class_iv.ClassEnd()");
	}

}
