package com.netcracker.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("SolarSystem"));
    }
}

/*
    1. xml конфиг
    2. аннотации
    3. java конфиг
    4. groovy конфиг
 */
