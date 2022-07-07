package pl.mateusz.Pecuniaspringtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping
    public String getindex(){
        return "index";
    }
}
