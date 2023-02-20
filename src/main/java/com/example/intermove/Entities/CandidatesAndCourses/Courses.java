package com.example.intermove.Entities.CandidatesAndCourses;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String DomainCourse;

    @ManyToMany
    @JsonIgnore
    List<Tags> tags;

}
