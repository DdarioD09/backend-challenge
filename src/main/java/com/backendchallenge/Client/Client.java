package com.backendchallenge.Client;

public record Client(
        DocumentType documentType,
        Integer id,
        String firstName,
        String middleName,
        String firstLastname,
        String secondLastname,
        String phoneNumber,
        String direction,
        String city
) {
}
