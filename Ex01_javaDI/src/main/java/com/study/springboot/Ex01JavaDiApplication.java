package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.multi.Config;
import com.study.springboot.multi.Person;
import com.study.springboot.multi.Printer;

//@SpringBootApplication	=>	이 주석이 있으면 자동으로 웹으로 실행됨
public class Ex01JavaDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ex01JavaDiApplication.class, args);
		
		//일반 자바로
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Person p1 = (Person)context.getBean("Person1");
		p1.print();
		
		Person p2 = context.getBean("hello", Person.class);
		p2.print();
		
		Printer printer = context.getBean("PrinterB", Printer.class);
		
		p1.setPrinter(printer);
		p1.print();
		
	}

}
