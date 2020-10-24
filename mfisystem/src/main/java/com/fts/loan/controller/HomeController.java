package com.fts.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        // add `message` attribute
        model.addAttribute("message", "Thank you for visiting.");

        // return view name
        return "index";
    }
    
    @GetMapping("/home")
    public String home(Model model) {

        // add `message` attribute
        model.addAttribute("uname", "NHOEK Senghuor");

        // return view name
        return "home";
    }
    
    @GetMapping("/test")
    public String test() {

    	// a in folder test
        return "test/a";
    }
    
    @GetMapping("/combine")
    public String combine() {

        return "combine";
    }
}
