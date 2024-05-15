package com.javatech.client.service;

import com.javatech.client.model.Client;

import java.util.List;

public interface ClientService {

    Client getClient(Integer id);

    List<Client> getClients();

    Client createClient(Client client);

    Client updateClient(Client client);

    void deleteClient(Integer id);
}
