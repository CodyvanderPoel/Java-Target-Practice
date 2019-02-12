package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.addForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")

public class AdditionController {
    @GetMapping
    public String getAdd() {
        return "add";
    }
    @PostMapping
    public String postAdd(addForm addForm, Model model){
        if (addForm.isValid()) {
            Integer total = addForm.sum();
            model.addAttribute("total", total);
        }
        return "add";
    }

}
