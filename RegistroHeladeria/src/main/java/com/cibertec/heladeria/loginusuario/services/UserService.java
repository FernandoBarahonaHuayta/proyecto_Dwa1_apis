package com.cibertec.heladeria.loginusuario.services;

import com.cibertec.heladeria.loginusuario.entities.User;

public interface UserService {
    User registerUser(String username, String password);
    User getUserByUsername(String username);
}
