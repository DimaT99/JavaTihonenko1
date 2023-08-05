package school_online.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
public class Teacher implements Comparable<Teacher>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private static int count;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public static int getCount() {
        return count;
    }

    public Teacher(int id, String name, Person person) {
        this.id = id;
        this.name = name;
        this.person = person;
        count++;
    }

    public Teacher() {
        count++;
    }

    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getPerson().getLastName().compareTo(o.getPerson().getLastName());
    }
}
