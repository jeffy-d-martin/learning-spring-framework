package com.dependenceinjection;

public class Spec {
    private String name;
    private String model;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Spec{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
