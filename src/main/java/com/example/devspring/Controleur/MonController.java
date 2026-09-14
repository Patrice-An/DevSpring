package com.example.devspring.Controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonController {

    @GetMapping("/bonjour")
    @ResponseBody
    public String direBonjour(){
        return "Hello World";
    }
}
