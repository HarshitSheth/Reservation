package com.train.reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {

    @Id
    private String name;

    public Details(){}

    public Details(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                '}';
    }
}
