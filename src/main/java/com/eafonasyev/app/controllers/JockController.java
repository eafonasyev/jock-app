package com.eafonasyev.app.controllers;

import com.eafonasyev.app.services.JockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JockController {

    private final JockService jockService;

    public JockController(JockService jockService) {
        this.jockService = jockService;
    }
    @GetMapping({"/",""})
    String showJock(Model model){
    model.addAttribute("jock",jockService.getJock());
        return "index";

    }
}
