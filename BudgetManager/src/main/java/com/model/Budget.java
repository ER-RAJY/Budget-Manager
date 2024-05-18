package com.model;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name = "budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBudget;

    private double limiteDepense;

    private String titre;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "budget")
    private Set<Transaction> transactions;

    // Getters and setters
    // ...
}
