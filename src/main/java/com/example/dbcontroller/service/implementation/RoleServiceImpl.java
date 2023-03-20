package com.example.dbcontroller.service.implementation;

import com.example.dbcontroller.model.Role;
import com.example.dbcontroller.repositories.RoleRepository;
import com.example.dbcontroller.service.interfaces.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(long roleId) {
        return roleRepository.findById(roleId);
    }
    @Override
    public Role save(Role role){ return roleRepository.save(role);}
}
