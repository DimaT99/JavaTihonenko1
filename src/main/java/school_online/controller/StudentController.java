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

    @GetMapping()
    public String getHome(Model model) {
        final List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/students")
    public String getStudent(Model model) {
        final List<Student> students = studentService.getStudents();
        model.addAttribute("student", students);
        return "student";
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
    public String formForTree(Model model) {
        return "studentserv";
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
