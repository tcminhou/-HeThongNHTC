/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.controllers;

import com.company.pojo.User;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author PC
 */
@Controller
public class UserController {

    @Autowired
    private UserService userDetailsService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model,@ModelAttribute(value = "user") User user) {
        String errMsg = "";
        if (user.getPassword().equals(user.getCofirmPassword())) {
            if (this.userDetailsService.register(user) == true) {
                return "redirect:/login";
            } else {
                errMsg = "Đã có lỗi xảy ra!";
            }
        }else
            errMsg = "Mật khẩu không khớp!";
        model.addAttribute("errMsg", errMsg);
        return "register";
    }
}
