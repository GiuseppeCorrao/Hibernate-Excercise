package co.develhope.HibernateExcercise.entities;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;


public class Enrollment {

    @Id
    private String id;

    @OneToMany
    Student student;

    @OneToMany
    Classes classes;
}
