package tn.ensit.spring.Person.entities;

import tn.ensit.spring.Cars.entities.Car;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "personne")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String FirstName;
    private String  LastName;



    public Person() {
    }

    public Person(Long id, String firstName, String lastName) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
