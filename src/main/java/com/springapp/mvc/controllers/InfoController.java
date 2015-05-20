package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/info")
public class InfoController {
    @RequestMapping(method = RequestMethod.POST)
    public String get(@ModelAttribute("par") String param, ModelMap map) {
        map.addAttribute("some_info", "\"" + param + "\"");
        return "info";
    }
}
