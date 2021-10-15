package org.example.lesson18.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PvvController {
    @GetMapping("/user")
    public String getMessage(@RequestParam(value = "name",required = false) String name,
                            Model model){
        model.addAttribute("message","Hello "+ (name == null ?"Unknown":name));
        return "user";
    }

}
