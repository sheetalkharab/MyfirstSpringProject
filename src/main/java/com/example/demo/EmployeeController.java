package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewEmployee(@RequestParam String salary, @RequestParam String designation,@RequestParam String employeeName
                                               ) {
        // , @RequestParam int salary, @RequestParam String designation) {


        Employee e1 = new Employee();
        e1.setEmployeeName(employeeName);
        e1.setDesignation(designation);
        e1.setSalary(Integer.valueOf(salary));
        employeeRepository.save(e1);
        return "Saved";

    }
}