package co.develhope.HibernateExcercise.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NonNull
    private String lastName;
    @NonNull
    private String firstName;


    @NonNull
    @Column(unique = true)
    private String email;
}
