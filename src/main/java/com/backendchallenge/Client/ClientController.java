package com.backendchallenge.Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clients")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(
            @RequestHeader(name = "Document-Type") DocumentType documentType,
            @PathVariable("id") String id
    ) {
        Client clientById = clientService.getClientById(documentType, id);
        return ResponseEntity.ok().body(clientById);
    }
}
