package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.Person;

import java.util.List;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
    List<Person> findAllByCourseId(int courseId);

    /*@Modifying
    @Transactional
    @Query("UPDATE Person p SET p.firstName = :#{#updatedPerson.firstName}, p.lastName = :#{#updatedPerson.lastName}, p.enumRole = :#{#updatedPerson.enumRole}, p.courseId = :#{#updatedPerson.courseId} WHERE p.id = :#{#updatedPerson.id}")
    void updatePerson(PersonRepo updatedPerson);*/
}
