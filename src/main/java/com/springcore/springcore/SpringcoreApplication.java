package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		System.out.println("Hello world");
		context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/student-config.xml");

		System.out.println("\n--------------Property Injection Examples----------------------\n");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);

		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);

		Student student4 = (Student) context.getBean("student4");
		System.out.println(student4);

		System.out.println("\n\n--------------Constructor Injection Examples----------------------\n\n");
		Student student5 = (Student) context.getBean("student5");
		System.out.println(student5);
	}

}
