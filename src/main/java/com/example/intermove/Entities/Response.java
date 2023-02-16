package com.example.intermove.Entities;

import javax.persistence.*;

public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String reponse;
    private int score;
    @Enumerated(EnumType.STRING)
    private EtatR etatR;

}
