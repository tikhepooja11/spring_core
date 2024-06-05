package com.springcore.javaformatconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
     private static ApplicationContext context;

     public static void main(String[] args) {
          context = new AnnotationConfigApplicationContext(JavaConfig.class);
          Student s1 = context.getBean("student", Student.class);
          System.out.println("Student Information : \t " + s1);
     }
}
