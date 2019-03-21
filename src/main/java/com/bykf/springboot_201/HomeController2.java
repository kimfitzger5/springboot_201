package com.bykf.springboot_201;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController2 {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "song form";
    }
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song,
                               Model model){
        model.addAttribute("song", song);
        return"confirmsong";
    }
}
