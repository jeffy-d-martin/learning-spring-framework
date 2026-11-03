package com.dependenceinjection;

public class Mobile {
    private Spec spec;

    public Mobile(Spec spec) {
        this.spec = spec;
    }

    public void displaySpec(){
        System.out.println(spec.toString());
    }
}
