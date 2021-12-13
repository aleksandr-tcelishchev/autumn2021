package com.example.springdatalesson;

import com.example.springdatalesson.model.PlanetObject;
import com.example.springdatalesson.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Optional;

@Component
public class Test {

    private ApplicationContext context;

    @Autowired
    public Test(ApplicationContext context) {
        this.context = context;
    }

    @PostConstruct
    public void init(){
        PlanetRepository planetRepository = context.getBean(PlanetRepository.class);
//        PlanetObject planetForUpdate = planetRepository.findById(1).get();
//
//
//        planetForUpdate.setPlanetName("Mars");
//        planetRepository.save(planetForUpdate);

//        PlanetObject planetForInsert = new PlanetObject();
//        planetForInsert.setPlanetName("Earth");
//        planetForInsert.setSolarSystemId(1);
        PlanetObject planetObject = new PlanetObject();
        planetObject.setPlanetName("Earth");
        planetRepository.save(planetObject);


        for (PlanetObject planet :
                planetRepository.findAll()) {
            System.out.println(planet);
        }
    }

    public static Integer value(){
        return null;
    }

}
