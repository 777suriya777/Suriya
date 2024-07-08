package com.suriya.springboot.cademy.controller;

import com.suriya.springboot.cademy.entity.User;
import com.suriya.springboot.cademy.service.UserService;
import com.suriya.springboot.cademy.user.WebUser;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private UserService userService;

    public LoginController(UserService userService){this.userService = userService;}

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/showRegistrationForm")
    public String showRegistrationForm(Model model){
        model.addAttribute("webUser",new WebUser());
        return "registration-form";
    }
    @PostMapping("/processRegistrationForm")
    public String processRegistrationForm(@Valid @ModelAttribute("webUser") WebUser webUser,
                                          BindingResult bindingResult, HttpSession session,
                                          Model model){
        if(bindingResult.hasErrors()){
            return "registration-form";
        }
        String userName = webUser.getUserName();
        User user = userService.findUserByUserName(userName);
        if(user != null){
            model.addAttribute("webUser",new WebUser());
            model.addAttribute("registrationError","User already exists");
            return "registration-form";
        }
        userService.save(webUser);
        session.setAttribute("user",user);
        return "registration-confirmation";
    }
}
