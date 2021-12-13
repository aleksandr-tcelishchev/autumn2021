package com.example.springdatalesson.model;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("PLANET")
public class PlanetObject {
    @Id
    private @AccessType(AccessType.Type.PROPERTY) Integer id;
    @Column("NAME")
    private String planetName;
    private Integer solarSystemId;
    @Transient
    private String myRuntimeField;

    public PlanetObject() {
    }

    public PlanetObject(Integer id, String planetName, Integer solarSystemId, String myRuntimeField) {
        this.id = id;
        this.planetName = planetName;
        this.solarSystemId = solarSystemId;
        this.myRuntimeField = myRuntimeField;
    }

    public void setId(Integer id) {
        System.out.println("Setted");
        this.id = id;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public Integer getId() {
        return id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + planetName + '\'' +
                ", solarSystemId=" + solarSystemId +
                '}';
    }
}
