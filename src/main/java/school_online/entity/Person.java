package school_online.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Pattern(regexp = "\\d{10}||\\d{3} \\d{3} \\d{2} \\d{2}||\\d{3} \\d{7}")
    private String phone;
    @Email
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
