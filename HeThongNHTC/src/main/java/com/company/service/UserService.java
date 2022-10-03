/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.service;

import com.company.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author PC
 */
public interface UserService extends UserDetailsService{
    User getUserByUsername(String username);
    boolean register(User user);
}
