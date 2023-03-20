package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);

    User findById(long id);
}
