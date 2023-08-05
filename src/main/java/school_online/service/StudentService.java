package school_online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school_online.entity.Student;
import school_online.repo.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepo studentRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(final Integer id) {
        return studentRepo.findById(id);
    }

    public void deleteStudent(final Student student) {
        studentRepo.delete(student);
    }

    public void save(Student student) {
        studentRepo.save(student);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}