package com.korena.testable.model;

import com.korena.aircraft.model.Aircraft;

public class Boing_777 extends Aircraft {

    public Boing_777(String name, int seats_count, int fuel_level, int fuel_capacity) {
        super(name, seats_count, fuel_level);
        super.setFuelCapacity(fuel_capacity);
    }

    public void flip(){
        System.out.println( getName() + " is flipping like a boss!");
    }
}
