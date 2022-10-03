/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.repository;

import com.company.pojo.User;

/**
 *
 * @author PC
 */
public interface UserRepository {
    User getUserByUsername(String username);
    boolean register(User user);
}
