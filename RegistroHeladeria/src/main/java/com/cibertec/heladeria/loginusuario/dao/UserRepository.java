package com.cibertec.heladeria.loginusuario.dao;

import com.cibertec.heladeria.loginusuario.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
