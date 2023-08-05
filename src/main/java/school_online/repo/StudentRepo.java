package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
