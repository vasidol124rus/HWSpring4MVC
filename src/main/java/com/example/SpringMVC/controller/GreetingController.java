package com.example.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class GreetingController {

    @GetMapping
    public String greeting(Model model) {
        model.addAttribute("name", "Иван");
        model.addAttribute("age", 25);
        return "index";
    }
    @PostMapping("/process")
    public String process(Model model, @RequestParam("name") String name,
                          @RequestParam("age") int age) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "result";
    }

}
