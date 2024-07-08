package com.suriya.springboot.cademy.dao;

import com.suriya.springboot.cademy.entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDao{
    private EntityManager entityManager;

    public RoleDAOImpl(EntityManager entityManager){this.entityManager = entityManager;}

    @Override
    public Role findRoleByName(String roleName) {
        TypedQuery<Role> query = entityManager.createQuery("from Role where roleName = :data",
                Role.class);
        query.setParameter("data",roleName);
        Role role = null;
        try{
            role = query.getSingleResult();
        }
        catch (Exception e){
            role = null;
        }
        return role;
    }
}
