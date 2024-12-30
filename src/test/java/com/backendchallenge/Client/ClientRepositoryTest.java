package com.backendchallenge.Client;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("ClientRepository tests")
class ClientRepositoryTest {

    @Autowired
    ClientRepository clientRepository = new ClientRepository();


    @Test
    @DisplayName("Should find all clients")
    void shouldFindAllClients() {
        Client client = new Client(
                DocumentType.CEDULA,
                "23445322",
                "Andres",
                "Camilo",
                "Delgado",
                "Ramirez",
                "3201232211",
                "Carrera 320 # 30 10",
                "Bogota"
        );

        assertEquals(1, clientRepository.getClients().size(),
                "Should have one client");
        assertTrue(clientRepository.getClients().contains(client),
                "The default client should be in the list");
    }
}