package com.springcore.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Salary {
     public double salaryAmount;

     public Salary() {
          super();
     }

     public Salary(double salaryAmount) {
          this.salaryAmount = salaryAmount;
     }

     public double getSalaryAmount() {
          return salaryAmount;
     }

     public void setSalaryAmount(double salaryAmount) {
          System.out.println("\n Setting salary");
          this.salaryAmount = salaryAmount;
     }

     @Override
     public String toString() {
          return "Salary [salaryAmount=" + salaryAmount + "]";
     }

     // Need to use these 2 annotations which are bydefault disabled, so we need to
     // enable them by adding context:annotation-config tag in xml file
     @PostConstruct
     public void start() {
          System.out.println("\n Salary setAmount: setting properties");
     }

     @PreDestroy
     public void end() {
          System.out.println("\n Salary bean getting destroyed");
     }

}
