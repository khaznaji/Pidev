package com.example.intermove.Entities.CandidatesAndCourses;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  Integer idCandidacy;
    private String NameDoc;

    @ManyToOne
    @JsonIgnore
    Candidacy candidacy;



}
