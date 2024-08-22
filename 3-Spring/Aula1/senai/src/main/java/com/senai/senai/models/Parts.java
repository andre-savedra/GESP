package com.senai.senai.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Parts") //opcional
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 250, nullable = false)
    private String description;

}
