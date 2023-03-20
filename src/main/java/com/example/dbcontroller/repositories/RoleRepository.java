package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(long id);
}
