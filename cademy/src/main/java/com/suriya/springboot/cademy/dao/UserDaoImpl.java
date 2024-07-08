package com.suriya.springboot.cademy.dao;

import com.suriya.springboot.cademy.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    private EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager){this.entityManager = entityManager;}

    @Override
    public User findUserByUserName(String userName) {
        TypedQuery<User> query = entityManager.createQuery("from User where userName = :data",
                User.class);
        query.setParameter("data",userName);
        User user = null;
        try{
            user = query.getSingleResult();
        }
        catch (Exception e){
            user = null;
        }
        return user;
    }

    @Override
    @Transactional
    public void save(User user) {
        entityManager.merge(user);
    }
}
