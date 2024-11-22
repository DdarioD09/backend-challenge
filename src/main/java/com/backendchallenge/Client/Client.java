package com.backendchallenge.Client;

public record Client(
        DocumentType identificationType,
        String identificationNumber,
        String firstName,
        String middleName,
        String lastName,
        String secondLastName,
        String phoneNumber,
        String address,
        String city
) {
}
