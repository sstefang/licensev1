package com.rockettest1.control.models;


import javax.persistence.*;

@Entity
@Table(name ="temperature")
public class Data {


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long time;
    @Column
    private Long temperature;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", time=" + time +
                ", temperature=" + temperature +
                '}';
    }
}

