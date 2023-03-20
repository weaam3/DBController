package com.example.dbcontroller.service.interfaces;


import com.example.dbcontroller.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountries();
    Country save(Country country);
    Country getCountryById(long countryId);
}
