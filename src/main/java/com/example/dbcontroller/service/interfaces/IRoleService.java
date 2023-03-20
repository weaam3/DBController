package com.example.dbcontroller.service.interfaces;

import com.example.dbcontroller.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRoles();

    Role getRoleById(long roleId);

    Role save(Role role);
}
