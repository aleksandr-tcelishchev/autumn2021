package com.example.springdatalesson.repository;

import com.example.springdatalesson.model.PlanetObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<PlanetObject, Integer> {
}
