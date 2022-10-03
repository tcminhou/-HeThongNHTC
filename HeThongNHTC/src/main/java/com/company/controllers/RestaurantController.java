/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.controllers;

import com.company.pojo.Restaurant;
import com.company.service.RestaurantService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author PC
 */
@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    
    @GetMapping("/restaurant")
    public String restaurant(Model model){
        model.addAttribute("restaurant", new Restaurant());
        return "restaurant";
    }
    
    @PostMapping("/restaurant")
    public String add(Model model, 
            @ModelAttribute(value = "restaurant") @Valid Restaurant r,
            BindingResult result) {
        if(result.hasErrors())
            return "restaurant";
        if(this.restaurantService.addRestaurant(r) == true)
            return "redirect:/";
        return "restaurant";
    }
}
