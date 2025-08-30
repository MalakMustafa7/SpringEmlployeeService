package com.example.service;

import com.example.model.Employee;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService{
    private Map<Long,Employee> employees = new HashMap<>();
    @Override
    public void create(Employee employee) {
           if(employee != null) {
               employees.put(employee.getId(), employee);
               System.out.println("Employee created: "+ employee);
           }
    }

    @Override
    public List<Employee> list() {
        return  new ArrayList<>(employees.values());
    }

    @Override
    public void delete(Long id) {
        Employee removed = employees.remove(id);
        if(removed != null)
            System.out.println("Employee removed: "+removed);
        else
            System.out.println("Employee Not Found With Id: "+id);

    }
}
