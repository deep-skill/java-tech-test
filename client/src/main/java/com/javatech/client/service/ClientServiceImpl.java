package com.javatech.client.service;

import com.javatech.client.model.Client;
import com.javatech.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl  implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client getClient(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getClients() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client newClient) {
        Client client = clientRepository.findById(newClient.getClientId()).orElse(null);
        client.update(newClient);
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer id) {
        Client client = clientRepository.findById(id).orElse(null);
        client.setStatus(false);
        clientRepository.save(client);
    }
}
