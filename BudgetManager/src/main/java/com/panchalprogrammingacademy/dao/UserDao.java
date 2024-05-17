package com.panchalprogrammingacademy.dao;

import com.panchalprogrammingacademy.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        return sessionFactory.getCurrentSession().createQuery("from User", User.class).list();
    }
}
