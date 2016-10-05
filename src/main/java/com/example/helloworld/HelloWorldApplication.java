package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
		HelloWorldBean helloWorldBean = ctx.getBean(HelloWorldBean.class);

		System.out.println(helloWorldBean.sayHelloWorld());

	}
}
