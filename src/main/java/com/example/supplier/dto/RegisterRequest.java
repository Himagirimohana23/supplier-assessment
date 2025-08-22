package com.example.supplier.dto;

public record RegisterRequest(
        String name,
        String email,
        String password,
        String country,
        String address,
        CompanyDto company
) { }
