package com.springcore.autowiring.byannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
     @Autowired // property injection
     @Qualifier("address1")
     public Address address;

     public Employee() {
          super();
     }

     // @Autowired // constructor injection
     public Employee(Address address) {
          this.address = address;
     }

     public Address getAddress() {
          return address;
     }

     // @Autowired // setter injection
     public void setAddress(Address address) {
          this.address = address;
     }

     @Override
     public String toString() {
          return "Employee [address=" + address + "]";
     }
}
