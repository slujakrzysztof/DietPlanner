package com.sluja.dietplanner.controller;

import com.sluja.dietplanner.service.MainViewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class MainViewController {

    private MainViewService mainViewService;

    public MainViewController(MainViewService mainViewService) {

        this.mainViewService = mainViewService;
    }

    @GetMapping("/main")
    public String showMainView(Model model){

        model.addAttribute("shortRecipes", mainViewService.getShortRecipes());
        return "mainView";
    }
}
