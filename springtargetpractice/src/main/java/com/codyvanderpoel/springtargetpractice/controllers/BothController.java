package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.bothForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/both")
public class BothController {
    @GetMapping
    public String getBoth() {
        return "both";
    }

    @PostMapping
    public String postBoth(bothForm form, Model model){
        if (form.isValid()) {
            String answer = form.findTrue();
            model.addAttribute("answer", answer);
        }
        return "both";
    }
}
