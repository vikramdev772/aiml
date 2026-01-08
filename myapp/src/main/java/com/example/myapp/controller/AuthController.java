package com.example.myapp.controller;

import com.example.myapp.services.Math;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping("/signup")
    String signup() {

        return "Signup sucess ...!";

    }

    @PostMapping("/sum/{n}")
    int s(@PathVariable int n) {

        return Math.sum(n);
    }
}
