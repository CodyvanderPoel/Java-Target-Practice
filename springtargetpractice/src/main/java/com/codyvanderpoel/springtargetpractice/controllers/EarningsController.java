package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.earningsForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/earnings")
public class EarningsController {
    @GetMapping
    public String getEarnings() {
        return "earnings";
    }

    @PostMapping
    public String postEarnings(earningsForm form, Model model){
        if (form.isValid()) {
            Integer total = form.gatherEarnings();
            model.addAttribute("total", total);
        }
        return "earnings";
    }
}
