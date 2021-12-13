package com.netcracker.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Planet {

    private String name;
    private String oldName2;

    public Planet(String name) {
        this.name = name;
    }

    public void setOldName(String oldName2) {
        this.oldName2 = oldName2;
    }

    public void setNonExistedField(String oldName2) {
        System.out.println("I'm not exist");
    }

    public void init(){
        System.out.println("Read json value");
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", oldName='" + oldName2 + '\'' +
                '}';
    }
}
