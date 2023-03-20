package com.example.dbcontroller.controller;

import com.example.dbcontroller.model.Role;
import com.example.dbcontroller.service.interfaces.IRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    @RequestMapping("/getAll")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping
    @RequestMapping("/getById")
    public Role getRoleById(@RequestParam("roleId") long roleId) {
        return roleService.getRoleById(roleId);
    }
    @PostMapping
    @RequestMapping("/save")
    public Role save(@RequestBody Role role){
        return roleService.save(role);
    }
}
