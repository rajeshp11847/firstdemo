package com.rajesh.firstdemo.service;

import com.rajesh.firstdemo.exceptionhandling.MyNoSuchElementException;
import com.rajesh.firstdemo.model.Employee;
import com.rajesh.firstdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveOrUpdate(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> fetchEmployeeList() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee, Integer id) {
        final Employee employee1 = employeeRepository.findById(id).get();

        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setMarks(employee.getMarks());

        return employeeRepository.save(employee1);
    }

    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee fetchEmployee(Integer id) throws MyNoSuchElementException{
        final Optional<Employee> byId = employeeRepository.findById(id);
        return byId.orElseThrow(()->new MyNoSuchElementException("No message available"));
    }
}
