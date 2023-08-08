package school_online.config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import school_online.entity.Student;
import school_online.service.StudentService;

import java.util.Random;

@Component
public class DbInit {

    private final StudentService studentService;

    private Random random = new Random();

    public DbInit(final StudentService studentService) {
        this.studentService = studentService;
    }

    @PostConstruct
    private void postConstruct() {
        for (int i = 0; i < 10; i++) {
            final Student student = new Student();
            student.setCourseId(random.nextInt(1, 4));
            student.setName("Student %d".formatted(i + 1));
            studentService.save(student);
        }
    }
}
