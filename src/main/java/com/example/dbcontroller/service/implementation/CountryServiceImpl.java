package com.example.dbcontroller.service.implementation;

import com.example.dbcontroller.model.Country;
import com.example.dbcontroller.repositories.CountryRepository;
import com.example.dbcontroller.service.interfaces.ICountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country getCountryById(long countryId) {
        return countryRepository.findCountryById(countryId);
    }
}
