package com.example.supplier.entity;


import com.example.supplier.model.*;

import java.util.*;

@Document(collection = "users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String country;
    private String address;

    Set<Role> roles = new HashSet<>();
}
