package com.backendchallenge.Client;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientById(DocumentType documentType, int id) {

        return clientRepository.getClients().stream()
                .filter(client -> client.documentType().equals(documentType) && client.id().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("Cliente con tipo de identificación " + documentType +
                                "y número " + id + " no ha sido encontrado"));
    }
}
