/** package com.cibertec.heladeria.loginusuario.controller;

import com.cibertec.heladeria.loginusuario.entities.User;
import com.cibertec.heladeria.loginusuario.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    
    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.getAllUsers();
    }
} **/
