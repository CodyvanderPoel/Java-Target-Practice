package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.multThreeForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/multThree")
public class MultThreeController {
    @GetMapping
    public String getMult() {
        return "multThree";
    }

    @PostMapping
    public String postMultThree(multThreeForm multThreeForm, Model model) {
        if (multThreeForm.isValid()) {
            Integer total = multThreeForm.multThree();
            model.addAttribute("total", total);
        }
        return "multThree";

    }
}
