package com.suriya.springboot.cademy.dao;

import com.suriya.springboot.cademy.entity.Role;

public interface RoleDao {
    Role findRoleByName(String roleName);
}
