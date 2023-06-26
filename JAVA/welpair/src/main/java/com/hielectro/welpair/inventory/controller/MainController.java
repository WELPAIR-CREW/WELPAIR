package com.hielectro.welpair.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/"})
    public String defaultLocation() {
        return "/HTML/consumer/index";
    }
}
