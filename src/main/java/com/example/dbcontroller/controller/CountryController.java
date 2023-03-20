package com.example.dbcontroller.controller;

import com.example.dbcontroller.model.Country;
import com.example.dbcontroller.service.interfaces.ICountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("country")
public class CountryController {
    private final ICountryService countryService;

    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getAllCountries")
    List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping("/save")
    Country save(Country country) {
        return countryService.save(country);
    }

    @GetMapping("/getCountryById")
    Country getCountryById(@RequestParam("countryId") long countryId) {
        return countryService.getCountryById(countryId);
    }
}
