package com.school_online.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
