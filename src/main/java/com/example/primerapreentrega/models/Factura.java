package com.example.primerapreentrega.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column
    @Getter
    @Setter
    private Long client_id;

    @Column
    @Getter
    @Setter
    private Long created_at;

    @Column
    @Getter
    @Setter
    private Double total;

}
