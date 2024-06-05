package com.springcore.autowiring.byannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

     private static ApplicationContext context;

     public static void main(String[] args) {
          context = new ClassPathXmlApplicationContext("com/springcore/autowiring/byannotation/autowire.xml");
          Employee emp1 = context.getBean("emp1", Employee.class);
          System.out.println("\nEmployee Information : " + emp1);
     }
}
