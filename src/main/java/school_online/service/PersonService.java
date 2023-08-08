package school_online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school_online.entity.EnumRole;
import school_online.entity.Person;
import school_online.repo.PersonRepo;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PersonService {
    private PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(final Person person) {
        personRepo.save(person);
    }

    public List<Person> findAll() {
        return personRepo.findAll();
    }

    public Optional<Person> getPerson(final Integer id) {
        return personRepo.findById(id);
    }

    public List<Person> getPersonList() {
        return personRepo.findAllByCourseId(1);
    }

    /*public void updatePerson(final PersonRepo person) {
        personRepo.updatePerson(person);
    }*/
    public void createPersonsBeforeStart() {
        final Random random = new Random();
        final int count = random.nextInt(10, 20);

        for (int i = 0; i < count; i++) {
            final Person person = new Person();
            person.setCourseId(random.nextInt(1, 10));
            person.setFirstName("Sponge%d".formatted(i));
            person.setLastName("Bob%d".formatted(i));

            if (i % 2 == 0) {
                person.setEnumRole(EnumRole.TEACHER);
            } else {
                person.setEnumRole(EnumRole.STUDENT);
            }
            personRepo.save(person);
        }
    }
}
