package com.example.intermove.Entities;

import javax.persistence.*;

public class Houses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Enumerated(EnumType.STRING)
    private TypeHouses TypeHouses;
    private String adress;
    private Boolean available;
    private Integer nbrOfRooms;

}
