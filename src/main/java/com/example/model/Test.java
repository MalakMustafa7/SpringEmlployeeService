package com.example.model;

import com.example.service.EmployeeService;
import com.example.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
               new ClassPathXmlApplicationContext("config/Configuration.xml");

        EmployeeService service = (EmployeeService)  applicationContext.getBean("empService");

        service.create(new Employee(1L, "Malak", 10000));
        service.create(new Employee(2L, "Omar", 8000));
        service.create(new Employee(3L, "Mostafa", 50000));

        System.out.println("==============================");
        System.out.println("All Employees: " + service.list());

        System.out.println("==============================");
        service.delete(2L);

        System.out.println("==============================");
        System.out.println("All Employees: " + service.list());







//        Employee employee =(Employee) applicationContext.getBean("employee");
//        Employee employee1 = (Employee) applicationContext.getBean("employee");
//        System.out.println(employee.hashCode());
//        System.out.println(employee1.hashCode());

//        System.out.println(employee);
       // applicationContext.close();



    }
}
