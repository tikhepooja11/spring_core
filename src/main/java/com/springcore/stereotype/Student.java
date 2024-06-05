package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Student {
     @Value("Pooja Tikhe")
     public String firstName;

     @Value("10")
     public int age;

     @Value("#{studentSubjects}")
     public List<String> subjects;

     public Student() {
          super();
     }

     public Student(String firstName, int age, List<String> subjects) {
          this.firstName = firstName;
          this.age = age;
          this.subjects = subjects;
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

     public List<String> getSubjects() {
          return subjects;
     }

     public void setSubjects(List<String> subjects) {
          this.subjects = subjects;
     }

     @Override
     public String toString() {
          return "Student [firstName=" + firstName + ", age=" + age + ", subjects=" + subjects + "]";
     }
}
