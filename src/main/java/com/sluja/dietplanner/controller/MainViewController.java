package com.sluja.dietplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class MainViewController {

    @GetMapping("/main")
    public String header(Model model){

        System.out.println("HERE");
        return "mainView";
    }
}
