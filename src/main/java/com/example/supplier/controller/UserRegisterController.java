package com.example.supplier.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/esg")
public class UserRegisterController {

    @GetMapping("/dashboard")
    public String getMessage(){
        return "Hello Dashboard";
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User){

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
