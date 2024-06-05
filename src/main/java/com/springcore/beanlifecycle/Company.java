package com.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Company implements InitializingBean, DisposableBean {
     public String companyName;

     Company() {
          super();
     }

     public String getCompanyName() {
          return companyName;
     }

     public void setCompanyName(String companyName) {
          System.out.println("\n  Setting company name : setting properties");
          this.companyName = companyName;
     }

     public Company(String companyName) {
          this.companyName = companyName;
     }

     @Override
     public String toString() {
          return "Company [companyName=" + companyName + "]";
     }

     @Override
     public void afterPropertiesSet() throws Exception {
          // works same as init() method when works with bean xml file
          System.out.println("\n Company bean initialized after setting properties.");
     }

     @Override
     public void destroy() throws Exception {
          System.out.println("\n Company bean destroyed");
     }

}
