package com.backendchallenge.Client;

import com.backendchallenge.exception.ResourceNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;
    private AutoCloseable autoCloseable;

    private ClientService underTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new ClientService(clientRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @DisplayName("When client does not exist")
    @Test
    void exceptionWhenClientIsNotFound() {
        assertThrows(
                ResourceNotFoundException.class,
                () -> underTest.getClientById(DocumentType.PASSPORT, "23445322"),
                "Should throw an exception");
    }

}