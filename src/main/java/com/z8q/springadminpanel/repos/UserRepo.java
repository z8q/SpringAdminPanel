package com.z8q.springadminpanel.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.z8q.springadminpanel.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}