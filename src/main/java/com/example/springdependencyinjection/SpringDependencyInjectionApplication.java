package com.example.springdependencyinjection;

import com.example.springdependencyinjection.controllers.ConstructorBasedDependencyInjection;
import com.example.springdependencyinjection.controllers.InController;
import com.example.springdependencyinjection.controllers.PropertyBasedDependencyInjection;
import com.example.springdependencyinjection.controllers.SetterBasedDependencyInjection;
import com.example.springdependencyinjection.services.GreetingServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		InController cnt= (InController)ctx.getBean("inController");
		System.out.println(cnt.sayHelloInLanguage());
		ConstructorBasedDependencyInjection controller=(ConstructorBasedDependencyInjection)ctx.getBean("constructorBasedDependencyInjection");
		System.out.println(controller.sayGreeting());
		System.out.println("new Dependency PropertyBased");
		PropertyBasedDependencyInjection pcontroller=(PropertyBasedDependencyInjection)ctx.getBean("propertyBasedDependencyInjection") ;
		System.out.println(pcontroller.sayGreeting());
		System.out.println("new Dependency SetterBased");
		SetterBasedDependencyInjection Scontroller=(SetterBasedDependencyInjection)ctx.getBean("setterBasedDependencyInjection") ;
		System.out.println(Scontroller.sayGreeting());
	}

}
