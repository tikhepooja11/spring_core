package com.springcore.beanlifecycle;

public class Employee {
        public String empName;

        Employee() {
                super();
        }

        public Employee(String empName) {
                this.empName = empName;
        }

        public String getEmpName() {
                return empName;
        }

        public void setEmpName(String empName) {
                System.out.println("\n Setting employee name : setting properties");
                this.empName = empName;
        }

        @Override
        public String toString() {
                return "Employee [empName=" + empName + "]";
        }

        // init & destroy names can be anything only the thing we have to pass these
        // names to init-method & destroy-method in xml bean file
        public void init() {
                System.out.println("\n Employee Bean initialized");
        }

        public void destroy() {
                System.out.println("\n Employee Bean getting destroyed");
        }

}
