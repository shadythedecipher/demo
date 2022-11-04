package com.ecommerceWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class indexController {
    @GetMapping("")
    public String showIndexPage(){
        return "index";
    }
    @GetMapping("")
    public String showContactPage(){
        return "contact";
    }

    
}