package pl.mateusz.Pecuniaspringtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.mateusz.Pecuniaspringtest.models.Country;
import pl.mateusz.Pecuniaspringtest.models.repositories.CountryRepository;

import java.util.List;

@Controller
public class CountryController {

    private CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/country")
    public String getCountry(ModelMap modelMap) {
        System.out.println("++++++++++++++++++++++++++++++++++++NAPIS TESTOWY++++++++++++++++++++++++++++++++++++");
        List<Country> countries = countryRepository.findAll();
        countries.forEach(System.out::println);
        modelMap.addAttribute("countries", countries);
        return "country/index";
    }

    @GetMapping("/country/new")
    public String getCountryNew(ModelMap modelMap){
        modelMap.addAttribute("countryForm", new Country());

        return "country/new";
    }
    @PostMapping("/country/add")
    public String postCountry(@ModelAttribute("countryForm") Country country, Model model){
        System.out.println("--------------------NAPIS TESTOWY--------------------------");
        System.out.println(country.toString());
        countryRepository.save(country);

        return "country/index";
    }

}
