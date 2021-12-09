package com.rj.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("classiii")
@Primary
public class Class_III implements SchoolClass {

	public Class_III() {
		System.out.println("Class_III.Class_III()");
	}

	@Override
	public void ClassStart() {
		System.out.println("Class_III.ClassStart()");

	}

	@Override
	public void ClassEnd() {
		System.out.println("Class_III.ClassEnd()");
	}

}
