package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.R;

@RestController
public class Main {
    @GetMapping("/")
    R m() {
        return new R();
    }

    @GetMapping("/m")
    String m1() {
        return "rest api ";
    }
}
