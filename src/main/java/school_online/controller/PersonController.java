package school_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import school_online.entity.EnumRole;
import school_online.entity.Person;
import school_online.service.PersonService;

import java.util.Optional;

@Controller
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService= personService;
    }

    @PostMapping("/person/add")
    public String addPerson(@RequestParam String firstName,
                            @RequestParam String lastName,
                            @RequestParam EnumRole enumRole,
                            @RequestParam String phone,
                            @RequestParam String email) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEnumRole(enumRole);
        person.setPhone(phone);
        person.setEmail(email);
        personService.savePerson(person);
        return "redirect:/students";
    }

    @GetMapping("/person/{id}")
    public String getPerson(Model model, @PathVariable Integer id) {
        final Optional<Person> personById = personService.getPerson(id);
        final Person person = personById.orElse(null);
        model.addAttribute("person", person);
        model.addAttribute("id", id);
        return "person/person";
    }

    @GetMapping("/person_students")
    public String allStudent(Model model) {
        model.addAttribute("students", personService.getPersonRole(EnumRole.STUDENT));
        return "person/students";
    }

    @GetMapping("/teachers")
    public String allTeacher(Model model) {
        model.addAttribute("teachers", personService.getPersonRole(EnumRole.TEACHER));
        return "person/teachers";
    }

}
