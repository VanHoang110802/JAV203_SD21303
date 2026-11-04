package com.example.lab1.controller;

import com.example.lab1.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getAllStudents(Model model) {

        model.addAttribute(
                "students",
                studentService.getAllStudents()
        );

        return "students";
    }
}
