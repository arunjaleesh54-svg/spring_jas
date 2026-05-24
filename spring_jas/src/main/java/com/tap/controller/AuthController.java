package com.tap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tap.dto.LoginRequest;
import com.tap.dto.LoginResponse;
import com.tap.entity.User;
import com.tap.repository.UserRepository;
import com.tap.security.JwtUtil;

@RestController
public class AuthController {

    @Autowired
    private UserRepository repo;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        User user = repo.findByUsername(request.getUsername());

        if(user != null &&
                user.getPassword().equals(request.getPassword())) {

            String token =
                    jwtUtil.generateToken(user.getUsername());

            return new LoginResponse(token);
        }

        return new LoginResponse("Invalid Username or Password");
    }
}
