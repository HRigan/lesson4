package ru.javacourse.lesson4.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping (value = "/index")
    public String index(){
                return "bootstrap4/index" ;
    }
}
