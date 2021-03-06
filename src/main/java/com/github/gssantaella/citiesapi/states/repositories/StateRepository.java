package com.github.gssantaella.citiesapi.states.repositories;

import com.github.gssantaella.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}