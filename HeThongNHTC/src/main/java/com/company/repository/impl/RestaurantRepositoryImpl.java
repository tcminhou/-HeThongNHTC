/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.repository.impl;

import com.company.pojo.Restaurant;
import com.company.pojo.User;
import com.company.repository.RestaurantRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PC
 */
@Repository
@PropertySource("classpath:messages.properties")
@Transactional
public class RestaurantRepositoryImpl implements RestaurantRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean addRestaurant(Restaurant r) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        r.setIdOwner(session.get(User.class, 4));
        try {           
            session.save(r);            
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
}
