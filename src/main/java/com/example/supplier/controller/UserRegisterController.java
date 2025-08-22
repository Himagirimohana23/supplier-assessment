package com.example.supplier.controller;

import com.example.supplier.dto.*;
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
    public ResponseEntity<RegisterResponse> registerUser(@RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<RegisterResponse>(HttpStatus.CREATED);
    }
}
