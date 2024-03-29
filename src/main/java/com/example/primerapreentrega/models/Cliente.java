package com.example.primerapreentrega.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private String lastname;

    @Column
    @Getter
    @Setter
    private Integer docnumber;

}
