package com.netcracker.spring;

public class StaticFactory {
    public static Planet getPlanet(String str){
        return new Planet(str);
    }
}
