package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.Homework;

@Repository
public interface HomeworkRepo extends JpaRepository<Homework, Integer> {
}
