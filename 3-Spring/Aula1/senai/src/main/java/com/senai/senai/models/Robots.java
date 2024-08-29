package com.senai.senai.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name = "Robots")
public class Robots implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Parts head;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Parts base;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Parts leftArm;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Parts rightArm;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Parts torso;

    public BigDecimal getTotalCost(){
        return new BigDecimal(0)
                .add(torso.getCost())
                .add(base.getCost())
                .add(leftArm.getCost())
                .add(rightArm.getCost())
                .add(head.getCost());
    }


}
