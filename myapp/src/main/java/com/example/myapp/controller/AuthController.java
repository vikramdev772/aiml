package com.example.myapp.controller;

import com.example.myapp.dto.SignupRequest;
import com.example.myapp.services.Math;

import jakarta.websocket.server.PathParam;

import java.io.PrintStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping("/signup")
    String signup(@RequestBody SignupRequest sd) throws Exception{
        PrintStream ps=new PrintStream("out.py");
        System.out.println("\n\t name : "+sd.getName());
        System.out.println("\n\t email : "+sd.getEmail());
        System.out.println("\n\t password : "+sd.getPassword());
        ps.println("\n\t name : "+sd.getName());
        ps.println("\n\t email : "+sd.getEmail());
        ps.println("\n\t password : "+sd.getPassword());
        

        return "Signup sucess ...!";

    }

    @PostMapping("/sum/{n}")
    int s(@PathVariable int n) {

        return Math.sum(n);
    }
}
