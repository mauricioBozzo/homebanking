package com.mindhub.home.banking.dtos;

import com.mindhub.home.banking.models.Account;
import com.mindhub.home.banking.models.Client;

import java.util.HashSet;
import java.util.Set;

public class ClientDTO {
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Set<Account> accounts = new HashSet<Account>();

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
        this.accounts = client.getAccounts();
    }
}
