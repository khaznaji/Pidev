package com.example.intermove.Entities.User;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String mail ;
    private String pass ;
    private String nom ;
    private String prenom ;
    private String region ;






}
