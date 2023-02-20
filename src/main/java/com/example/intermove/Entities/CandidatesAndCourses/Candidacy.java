package com.example.intermove.Entities.CandidatesAndCourses;

import com.example.intermove.Entities.Offer.Offer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Candidacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idC ;
    private Integer idEtudiant ;
    private Integer idUniversite;
    private Date Delai;
    private String DepotDoc;

    @ManyToOne
    @JsonIgnore
    Offer offer;

    @OneToMany(mappedBy = "candidacy")
    List<Document> documents;


}
