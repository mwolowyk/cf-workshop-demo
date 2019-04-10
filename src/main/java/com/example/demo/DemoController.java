package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DemoController {

    @Value("${my_secret}")
    String secret;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("secret", secret);
        return "index";
    }
}
