
package com.example.race.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private int topSpeed;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
}
