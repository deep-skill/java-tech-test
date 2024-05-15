package com.javatech.client.controller;

import com.javatech.client.model.Client;
import com.javatech.client.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients", produces = "application/json")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody Client getClient(@PathVariable Integer id) {
        return clientService.getClient(id);
    }

    public @ResponseBody List<Client> getClients() {
        return clientService.getClients();
    }

}
