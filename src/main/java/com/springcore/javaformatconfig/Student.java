package com.springcore.javaformatconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
     @Value("Pooja Tikhe")
     public String firstName;

     @Value("10")
     public int age;

     public Student() {
          super();
     }

     public Student(String firstName, int age) {
          this.firstName = firstName;
          this.age = age;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     @Override
     public String toString() {
          return "Student [firstName=" + firstName + ", age=" + age + "]";
     }
}
