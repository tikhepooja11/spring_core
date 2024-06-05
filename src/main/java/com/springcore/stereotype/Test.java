package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     private static ApplicationContext context;

     public static void main(String[] args) {
          context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations.xml");
          Student s1 = context.getBean("student", Student.class);
          System.out.println("Student Information : \t " + s1);
     }
}
