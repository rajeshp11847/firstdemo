package com.rajesh.firstdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Value("${app.name}")
    private String app;

    @GetMapping("/msg")
    public String getMsg() {
        return app;
    }
}
