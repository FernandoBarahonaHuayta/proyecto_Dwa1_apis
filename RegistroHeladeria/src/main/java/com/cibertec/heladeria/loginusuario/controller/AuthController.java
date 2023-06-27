package com.cibertec.heladeria.loginusuario.controller;

import com.cibertec.heladeria.loginusuario.entities.User;
import com.cibertec.heladeria.loginusuario.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    
    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest request) {
        User user = userService.getUserByUsername(request.getUsername());
        
        if (user == null) {
            return "El usuario no existe";
        }
        
        if (!user.getPassword().equals(request.getPassword())) {
            return "Contraseña incorrecta";
        }
        
        // Lógica adicional para el inicio de sesión exitoso
        
        return "Inicio de sesión exitoso";
    }
    
    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest request) {
        User existingUser = userService.getUserByUsername(request.getUsername());
        
        if (existingUser != null) {
            return "El nombre de usuario ya está en uso";
        }
        
        userService.registerUser(request.getUsername(), request.getPassword());
        return "Usuario registrado exitosamente";
    }
}
