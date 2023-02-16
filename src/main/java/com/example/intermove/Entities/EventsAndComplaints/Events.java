package com.example.intermove.Entities.EventsAndComplaints;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String title;
    private String description;
    private Date dateD;
    private Date dateF;
    private Integer nbreDePlaces;
    private String Speaker;
    @Enumerated(EnumType.STRING)
    private TypeEvent typeEvent;
    @Enumerated(EnumType.STRING)
    private ModaliteEvent modaliteEvent;



}
