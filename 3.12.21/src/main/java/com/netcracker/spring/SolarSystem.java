package com.netcracker.spring;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.List;

@Documentated
public class SolarSystem {
    @NotNull
    private Star star;
    private List<Planet> planets;
    private ApplicationContext applicationContext;
    private HashMap<String,String>

    @Autowired
    public SolarSystem(Star star, List<Planet> planets, ApplicationContext applicationContext) {
        this.star = star;
        this.planets = planets;
        this.applicationContext = applicationContext;
    }

    @Override
    public String toString() {
        System.out.println(applicationContext.getBean("Mars"));
        return "SolarSystem{" +
                "star=" + star +
                ", planets=" + planets +
                ", applicationContext=" + applicationContext +
                '}';
    }
}
