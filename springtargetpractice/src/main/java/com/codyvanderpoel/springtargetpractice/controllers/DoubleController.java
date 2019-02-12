package com.codyvanderpoel.springtargetpractice.controllers;


import com.codyvanderpoel.springtargetpractice.forms.doubleForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/double")
public class DoubleController {
    @GetMapping
    public String getDouble() {
        return "double";
    }

    @PostMapping
    public String postDouble(doubleForm doubleForm, Model model){
        if (doubleForm.isValid()) {
            Integer total = doubleForm.doubleNum();
            model.addAttribute("total", total);
        }
        return "double";
    }
}
