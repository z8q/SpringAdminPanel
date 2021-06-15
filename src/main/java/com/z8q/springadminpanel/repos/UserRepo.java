package com.z8q.springadminpanel.repos;

import com.z8q.springadminpanel.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}