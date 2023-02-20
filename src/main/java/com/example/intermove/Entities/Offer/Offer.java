package com.example.intermove.Entities.Offer;

import com.example.intermove.Entities.CandidatesAndCourses.Candidacy;
import com.example.intermove.Entities.CandidatesAndCourses.Tags;
import com.example.intermove.Entities.Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String title;
    private String description;
    private Date dateD;
    private Date dateF;
    @Enumerated(EnumType.STRING)
    private Domain domain;

    @OneToMany(mappedBy = "offer",cascade = CascadeType.ALL )
    List<Candidacy> candidacies;

    @ManyToMany
    List<Tags> tags;

}
