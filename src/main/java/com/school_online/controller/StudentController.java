package com.school_online.controller;

import com.school_online.entity.EnumRole;
import com.school_online.entity.Person;
import com.school_online.entity.Student;
import com.school_online.repo.Menu;
import com.school_online.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {


    private final StudentService studentService;

    private final Menu menu;

    @Autowired
    public StudentController(StudentService studentService, Menu menu) {
        this.studentService = studentService;
        this.menu = menu;
    }

    @RequestMapping("/mvc")
    @ResponseBody
    public String mvc() {
        return "Hello in a Spring MVC";
    }

    @GetMapping("/")
    public String start(Model model) {
        model.addAttribute("message", "Hello, World!");
        model.addAttribute("menu", menu.getMenuItems());
        return "hello";
    }

    @GetMapping("/form")
    public String showStudentForm(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        return "jadder";
    }

    @GetMapping("/all-students")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("students", studentService.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String type) {
        Student student = new Student();
        Person person = new Person();
        student.setName(name);
        person.setEmail(email);
        person.setEnumRole(EnumRole.STUDENT);
        studentService.save(student);
        return "redirect:/all-students";
    }
}
