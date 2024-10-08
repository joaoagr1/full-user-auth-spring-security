package com.authentication.module.repositories;

import com.authentication.module.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, String> {
  
    UserDetails findByLogin(String login);


    boolean existsByLogin(String login);

    boolean existsByDocument(String document);

    boolean existsByEmail(String email);

    Optional<Users> findByEmail(String email);

    Optional<Users> findUserByLogin(String login);

    void deleteByEmail(String email);

    void deleteByLogin(String username);
}
