package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.GoldStarsForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/GoldStars")
public class GoldStarsController {

    @GetMapping
    public String getGoldStars() {
        return "GoldStars";
    }
    @PostMapping
    public String postGoldStars(GoldStarsForm form, Model model) {
        if (form.isValid()) {
            String stars = form.howManyStars();
            model.addAttribute("stars", stars);
        }
        return "GoldStars";
    }
}
