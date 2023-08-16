package school_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import school_online.entity.EnumRole;
import school_online.entity.Person;
import school_online.entity.Student;
import school_online.service.StudentService;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/spring")
    public String start(Model model) {
        model.addAttribute("message", "Hello, Spring boot!");
        return "hello";
    }
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        final List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "all-students";
    }

    @GetMapping("/students/{id}")
    public String getStudents(Model model, @PathVariable Integer id) {
        final Optional<Student> treeById = studentService.getStudentById(id);
        final Student student = treeById.orElse(null);
        model.addAttribute("student", student);
        model.addAttribute("id", id);
        return "student";
    }
    @GetMapping("/student")
    public String formForStudent(Model model) {
        return "studentserv";
    }
    @PostMapping("/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam Integer courseId) {
        Student student = new Student();
        student.setName(name);
        student.setCourseId(courseId);
        studentService.save(student);
        return "redirect:/students";
    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(Model model, @PathVariable Integer id) {
        final Optional<Student> studentById = studentService.getStudentById(id);
        final Student student = studentById.orElse(null);
        studentService.deleteStudent(student);
        return "redirect:/students";
    }
}
