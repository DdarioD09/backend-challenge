package com.backendchallenge.Client;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    private final List<Client> clients = new ArrayList<Client>();

    {
        clients.add(new Client(
                DocumentType.CEDULA,
                "23445322",
                "Andres",
                "Camilo",
                "Delgado",
                "Ramirez",
                "3201232211",
                "Carrera 320 # 30 10",
                "Bogota"
        ));
    }

    public List<Client> getClients() {
        return clients;
    }
}
