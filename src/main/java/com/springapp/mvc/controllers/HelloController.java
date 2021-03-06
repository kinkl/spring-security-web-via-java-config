package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(value = "custom_login")
    public String customLoginPage() {
        return "my_login_page";
    }


    @RequestMapping(value = "custom_login", params = "error")
    public String logonError(ModelMap map) {
        map.addAttribute("logon_error", "Ошибка аутентификации");
        return "my_login_page";
    }
}