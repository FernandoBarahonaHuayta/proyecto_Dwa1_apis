package com.cibertec.heladeria.loginusuario.controller;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    private String username;
    private String password;
}
