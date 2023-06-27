package com.cibertec.heladeria.loginusuario.services;

import com.cibertec.heladeria.loginusuario.dao.UserRepository;
import com.cibertec.heladeria.loginusuario.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User registerUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}