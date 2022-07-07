package pl.mateusz.Pecuniaspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

    @GetMapping("/country")
    public String getCountry() {
        System.out.println("++++++++++++++++++++++++++++++++++++NAPIS TESTOWY++++++++++++++++++++++++++++++++++++");
        return "country";
    }
}
