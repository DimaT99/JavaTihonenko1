package school_online.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int courseId;
    private EnumRole enumRole;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Person(int id, int courseId, EnumRole enumRole, String firstName, String lastName) {
        this.id = id;
        this.courseId = courseId;
        this.enumRole = enumRole;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", enumRole=" + enumRole +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
