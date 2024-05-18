package com.model;

import jakarta.persistence.*;

import java.util.Date;
import jakarta.persistence.Entity;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransaction;

    private double montant;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    // Getters and setters
    // ...
}
