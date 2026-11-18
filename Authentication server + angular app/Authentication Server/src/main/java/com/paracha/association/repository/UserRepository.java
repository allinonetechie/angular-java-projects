package com.paracha.association.repository;

import java.util.List;
import java.util.Optional;

import com.paracha.association.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import com.paracha.association.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    List<User> findAllByRoles(Role role);
}