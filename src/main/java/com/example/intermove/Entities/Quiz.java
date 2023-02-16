package com.example.intermove.Entities;

import javax.persistence.*;

public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nom;
    private String description ;
    @Enumerated(EnumType.STRING)
    private Domain domain;
    private int timelimit ;
    private int score ;
    @Enumerated(EnumType.STRING)
    private EtatQ etat;




}
