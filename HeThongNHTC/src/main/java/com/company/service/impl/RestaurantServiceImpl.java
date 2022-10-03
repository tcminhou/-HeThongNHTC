/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service.impl;

import com.company.pojo.Restaurant;
import com.company.repository.RestaurantRepository;
import com.company.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class RestaurantServiceImpl implements RestaurantService{
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public boolean addRestaurant(Restaurant r) {
        r.setStatus("chờ duyệt");
        return this.restaurantRepository.addRestaurant(r);
    }
    
}
