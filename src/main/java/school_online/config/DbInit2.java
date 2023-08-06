package school_online.config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import school_online.entity.EnumRole;
import school_online.entity.Person;
import school_online.service.PersonService;

import java.util.Random;
@Component
public class DbInit2 {
    private PersonService personService;

    private Random random = new Random();

    public DbInit2(final PersonService personService) {
        this.personService = personService;
    }

    @PostConstruct
    private void postConstruct2() {

        for (int i = 0; i < 20; i++) {
            final Person person = new Person();
            person.setCourseId(random.nextInt(1, 4));
            person.setFirstName("Sponge%d".formatted(i));
            person.setLastName("Bob%d".formatted(i));

            if (i % 2 == 0) {
                person.setEnumRole(EnumRole.TEACHER);
            } else {
                person.setEnumRole(EnumRole.STUDENT);
            }
            personService.savePerson(person);
        }
    }
}
