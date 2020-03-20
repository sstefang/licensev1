package com.rockettest1.control.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Measures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer Time;

    private Integer Humidity;

    private Integer Pressure;

    private Integer Temperature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer time) {
        Time = time;
    }

    public Integer getHumidity() {
        return Humidity;
    }

    public void setHumidity(Integer humidity) {
        Humidity = humidity;
    }

    public Integer getPressure() {
        return Pressure;
    }

    public void setPressure(Integer pressure) {
        Pressure = pressure;
    }

    public Integer getTemperature() {
        return Temperature;
    }

    public void setTemperature(Integer temperature) {
        Temperature = temperature;
    }
}
