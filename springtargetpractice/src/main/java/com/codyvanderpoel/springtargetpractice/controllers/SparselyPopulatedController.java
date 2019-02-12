package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.SparselyPopulatedForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/SparselyPopulated")
public class SparselyPopulatedController {

    @GetMapping
    public String getSparselyPopulated() {
        return "SparselyPopulated";
    }

    @PostMapping
    public String postSparselyPopulated(SparselyPopulatedForm form, Model model) {
        if (form.isValid()) {
            String result = form.howPopulated();
            model.addAttribute("result", result);
        }
        return "SparselyPopulated";

    }
}
