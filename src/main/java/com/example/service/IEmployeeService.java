package com.example.service;

import com.example.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public void create(Employee employee);
    public List<Employee> list();
    public void delete(Long id);

}
