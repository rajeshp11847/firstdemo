package com.rajesh.firstdemo.controller;

import com.rajesh.firstdemo.exceptionhandling.MyNoSuchElementException;
import com.rajesh.firstdemo.model.Employee;
import com.rajesh.firstdemo.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/operation")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/emp")
    public Employee save(@Valid @RequestBody Employee employee) {
        log.info("save method in EmployeeController class");
        return employeeService.saveOrUpdate(employee);
    }

    @GetMapping("/emp/{id}")
    public Employee fetchEmployee(@PathVariable Integer id) {
        return employeeService.fetchEmployee(id);
    }

    @ExceptionHandler(MyNoSuchElementException.class)
    public ModelAndView handleException(NullPointerException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", ex.getMessage());
        return modelAndView;
    }

    @GetMapping("/emp")
    public List<Employee> fetchEmployeeList() {
        return employeeService.fetchEmployeeList();
    }


    @PutMapping("/emp/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") Integer id) {
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployeeById(@PathVariable("id") Integer id) {
        employeeService.deleteEmployeeById(id);
        return "Deleted Successfully";
    }
}
