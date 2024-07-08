package com.suriya.springboot.cademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    @GetMapping("/loginPage")
    public String loginForm(){
        return "login-form";
    }
}
