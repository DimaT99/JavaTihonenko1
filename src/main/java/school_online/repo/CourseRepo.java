package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
