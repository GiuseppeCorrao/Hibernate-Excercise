package co.develhope.HibernateExcercise.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NonNull
    private String title;

    @NonNull
    private String description;

}
