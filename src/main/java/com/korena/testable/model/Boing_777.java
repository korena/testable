package com.korena.testable.model;



public class Boing_777 extends Aircraft {

    public Boing_777(String name, int seats_count, int fuel_level) {
        super(name, seats_count, fuel_level);
        super.setFuelCapacity(200);
    }

    public void flip(){
        System.out.println( getName() + " is flipping like a boss!");
    }
}
