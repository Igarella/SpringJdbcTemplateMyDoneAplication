package ru.alishev.springcourse.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Neil Alishev
 */
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    @Column(name = "full_name")
    private String fullName;

    @Min(value = 0, message = "Age should be greater than 0")
    @Column(name = "birth_date")
    private int birthDate;

//    @NotEmpty(message = "Email should not be empty")
//    @Email(message = "Email should be valid")
//    private String email;

    public Person() {

    }

    public Person(String fullName, int birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
