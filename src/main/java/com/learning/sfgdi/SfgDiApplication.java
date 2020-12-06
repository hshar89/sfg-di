package com.learning.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.sfgdi.controller.ContructorInjectedController;
import com.learning.sfgdi.controller.MyController;
import com.learning.sfgdi.controller.PropertyInjectedController;
import com.learning.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = ctx.getBean("myController",MyController.class);
		System.out.println(controller.sayHello());
		PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController",PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());
		SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController",SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		ContructorInjectedController contructorInjectedController = ctx.getBean("contructorInjectedController",ContructorInjectedController.class);
		System.out.println(contructorInjectedController.getGreeting());
	}

}
