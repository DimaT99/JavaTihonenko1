package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import school_online.entity.Teacher;

@Component
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
