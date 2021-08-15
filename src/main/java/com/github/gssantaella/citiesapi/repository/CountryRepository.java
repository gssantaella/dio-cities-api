package com.github.gssantaella.citiesapi.repository;

import com.github.gssantaella.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}