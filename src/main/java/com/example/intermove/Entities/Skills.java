package com.example.intermove.Entities;

import javax.persistence.*;

public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nom;
    private String prenom;
    private String description;
    @Enumerated(EnumType.STRING)
    private Domain domain;

}
