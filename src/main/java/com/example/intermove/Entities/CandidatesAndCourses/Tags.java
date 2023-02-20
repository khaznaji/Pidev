package com.example.intermove.Entities.CandidatesAndCourses;

import com.example.intermove.Entities.Offer.Offer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String NameTag;

    @ManyToMany(mappedBy = "tags")
    @JsonIgnore
    List<Courses> courses;

    @ManyToMany(mappedBy = "tags")
    List<Offer> offers;
}
