package com.mindhub.home.banking.controllers;

import com.mindhub.home.banking.models.Client;
import com.mindhub.home.banking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/api/clients")
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
