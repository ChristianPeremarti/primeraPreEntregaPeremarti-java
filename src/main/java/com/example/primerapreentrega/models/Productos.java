package com.example.primerapreentrega.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column
    @Getter
    @Setter
    private String description;

    @Column
    @Getter
    @Setter
    private String code;

    @Column
    @Getter
    @Setter
    private Integer stock;

    @Column
    @Getter
    @Setter
    private Double price;
}
