package com.example.model;

import org.springframework.stereotype.Component;


public class Employee {
    Long id;
    String name;
    double salary;

    public Employee(Long id , String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void init(){
        System.out.println("Bean Initialized");

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "\nID: "+id+ "\nname: " +name +"\nsalary:"+salary;
    }
    public void destroy(){
        System.out.println("Bean Destroyed");

    }
}
