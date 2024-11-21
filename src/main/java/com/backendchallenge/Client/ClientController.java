package com.backendchallenge.Client;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("{id}")
    public Client getClientById(
            @RequestHeader(name = "Document-Type") DocumentType documentType,
            @PathVariable("id") int id
    ) {
        return clientService.getClientById(documentType, id);
    }
}
