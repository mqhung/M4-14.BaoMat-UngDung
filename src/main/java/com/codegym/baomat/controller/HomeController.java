package com.codegym.baomat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/user")
    public ModelAndView userForm(){
        ModelAndView modelAndView = new ModelAndView("/user");
        return modelAndView;
    }

    @GetMapping("/admin")
    public ModelAndView adminForm(){
        ModelAndView modelAndView = new ModelAndView("/admin");
        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView homeForm(){
        return new ModelAndView("/home");
    }
}
