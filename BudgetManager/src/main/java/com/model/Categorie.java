package com.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategorie;

    private String nomCategorie;

    private double montant;

    @OneToMany(mappedBy = "categorie")
    private Set<Transaction> transactions;

    // Getters and setters
    // ...
}
