package pl.mateusz.Pecuniaspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getindex(){
        System.out.println("NAPIS TESTOWY");
        return "home/index";
    }
}
