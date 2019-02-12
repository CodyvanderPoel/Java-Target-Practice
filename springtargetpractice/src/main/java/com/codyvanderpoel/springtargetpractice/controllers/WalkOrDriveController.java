package com.codyvanderpoel.springtargetpractice.controllers;

import com.codyvanderpoel.springtargetpractice.forms.walkOrDriveForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/walkOrDrive")
public class WalkOrDriveController {
    @GetMapping
    public String getWalkOrDrive() {
        return "walkOrDrive";
    }

    @PostMapping
    public String postWalkOrDrive(walkOrDriveForm walkOrDriveForm, Model model) {
        if (walkOrDriveForm.isValid()) {
            String result = walkOrDriveForm.canWalk();
            model.addAttribute("result", result);
        }
        return "walkOrDrive";

    }

}
