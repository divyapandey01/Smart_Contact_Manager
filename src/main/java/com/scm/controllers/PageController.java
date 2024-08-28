package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home Page Handler");
        return "home";
    }

    @RequestMapping("/about")
    public  String aboutPage() {
        System.out.println("About page Handler");
        return "about";
    }

    @RequestMapping("/services")
    public  String servicesPage() {
        System.out.println("Services page Handler");
        return "services";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
