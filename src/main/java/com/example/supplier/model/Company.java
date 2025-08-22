package com.example.supplier.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "companies")
public class Company {
    @Id
    private String id;
    private String name;
    private String address;
    @Indexed(unique = true)
    private String taxId;
}
