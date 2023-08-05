package school_online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school_online.entity.Teacher;
import school_online.repo.TeacherRepo;

@Component
public class TeacherService {
    private TeacherRepo teacherRepo;

    @Autowired
    public TeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void save(Teacher teacher) {
        teacherRepo.save(teacher);
    }
}
