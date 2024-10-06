package com.dailycodebuffer.spring_boot.tutorial.controller;

import com.dailycodebuffer.spring_boot.tutorial.entity.Department;
import com.dailycodebuffer.spring_boot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);

    }

    @GetMapping("/departments/{id}")
    public Department fecthDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }


    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return  departmentService.fetchDepartmentList();

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "depatment delete successfully";
    }


    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
      return  departmentService.updateDepartment(departmentId,department);
    }

}
