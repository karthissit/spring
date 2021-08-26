package org.test;

import org.classes.AppConfig;
import org.interfaces.Cars;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			Cars aCar = context.getBean("glanza", Cars.class);
			
			System.out.println(aCar.specs());
		context.close();
	}
}
