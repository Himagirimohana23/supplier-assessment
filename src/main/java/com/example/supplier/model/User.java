package com.example.supplier.model;


import com.example.supplier.enums.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.*;

@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String country;
    private String address;

    Set<Role> roles = new HashSet<>();
}
