package co.develhope.HibernateExcercise.entities;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;


public class Enrollment {

    @Id
    private String id;

    @JoinColumn(name = "student_id",referencedColumnName = "id")
    Student student;

    @JoinColumn(name = "classes_id",referencedColumnName = "id")
    Classes classes;
}
