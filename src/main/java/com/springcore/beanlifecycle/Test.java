package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        // private static AbstractApplicationContext context;

        public static void main(String[] args) {
                AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                                "com/springcore/beanlifecycle/bean-lifecycle.xml");
                // Employee e1 = (Employee) context.getBean("emp1");
                // System.out.println(e1);
                context.registerShutdownHook();

                // Company c1 = (Company) context.getBean("company1");
                // System.out.println(c1);

                Salary s1 = (Salary) context.getBean("salary1");
                System.out.println("\n" + s1);
        }
}
