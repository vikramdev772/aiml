package com.example.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.RegisterDto;
import com.example.myapp.model.User;
import com.example.myapp.repo.UserRepository;

@RestController
public class Auth {

    @Autowired
    UserRepository db;

    @PostMapping("/reg")
    public String register(@RequestBody RegisterDto rd) {
        User ud = new User();
        ud.setName(rd.getName());
        ud.setEmail(rd.getEmail());
        ud.setPassword(rd.getPassword());

        db.save(ud);
        // return "register sucess ..!";
        return "Register sucessful....!\n\t data => {\n\t name : " + rd.getName() + "\n\t email : " + rd.getEmail()
                + "\n}\n";
    }
}
