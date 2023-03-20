package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findCountryById(long id);
}
