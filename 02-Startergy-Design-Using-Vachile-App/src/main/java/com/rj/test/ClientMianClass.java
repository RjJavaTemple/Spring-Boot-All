package com.rj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rj.beans.VachileMain;
import com.rj.cfgs.VachileConfigClass;

public class ClientMianClass {

	public static void main(String[] args) {
		//Create The Ioc Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(VachileConfigClass.class);
		//Lode The Vaichele Class
		VachileMain main=ctx.getBean("vachileMain",VachileMain.class);
		main.JurnyCar("Jajpur", "Puri");
		System.out.println();
		System.out.println("Main Work Are Complited");
		//close The ctx
		ctx.close();
	}
	
}
