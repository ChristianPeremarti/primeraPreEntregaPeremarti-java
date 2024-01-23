package com.example.primerapreentrega.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
public class Detalles {

    @Column
    @Getter
    @Setter
    private Integer invoice_id;

    @Column
    @Getter
    @Setter
    private Integer invoice_detail_id;

    @Column
    @Getter
    @Setter
    private Integer amount;

    @Column
    @Getter
    @Setter
    private Integer product_id;

    @Column
    @Getter
    @Setter
    private Double price;
}
