package com.mindhub.home.banking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String number;
    private LocalDateTime creationDate;
    private Double balance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="owner_id")
    private Client owner;

    public Account() {}
    public Account(String number, LocalDateTime creationDate, Double balance, Client owner) {
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
        this.owner = owner;
    }

    public Client getOwner() {return owner;}
    public void setOwner(Client owner) {this.owner = owner;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public LocalDateTime getCreationDate() {return creationDate;}
    public void setCreationDate(LocalDateTime creationDate) {this.creationDate = creationDate;}

    public Double getBalance() {return balance;}
    public void setBalance(Double balance) {this.balance = balance;}
}
