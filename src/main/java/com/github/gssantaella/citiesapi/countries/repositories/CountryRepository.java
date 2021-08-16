package com.github.gssantaella.citiesapi.countries.repositories;

import com.github.gssantaella.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}