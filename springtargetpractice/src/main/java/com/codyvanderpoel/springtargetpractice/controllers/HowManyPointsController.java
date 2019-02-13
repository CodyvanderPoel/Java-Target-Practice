package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.HowManyPointsForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HowManyPoints")
public class HowManyPointsController {
    @GetMapping
    public String getHowManyPoints() {
        return "HowManyPoints";
    }

    @PostMapping
    public String postHowManyPoints(HowManyPointsForm form, Model model) {
        if (form.isValid()) {
         String points = form.howManyPoints();
         model.addAttribute("points", points);
        }
        return "HowManyPoints";
    }
}
