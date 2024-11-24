package com.backendchallenge.Client;

import com.backendchallenge.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientById(DocumentType documentType, String id) {
        return clientRepository.getClients().stream()
                .filter(client -> client.identificationType().equals(documentType) && client.identificationNumber().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException("El cliente identificado con " + documentType +
                                " y número " + id + " no ha sido encontrado"));
    }
}
