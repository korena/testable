package com.korena.testable.model;

import java.time.Instant;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class Aircraft {
    private int seatsCount;
    private int fuelLevel;
    private String name;

    private int fuelCapacity = 300;
    private Instant lastMaintained = Instant.now();

    Aircraft(String name, int seats_count, int fuel_level) {
        this.name = name;
        this.seatsCount = seats_count;
        this.fuelLevel = fuel_level;
    }

    public void takeoff() {
        log.info(this.name + " is taking off");
    }

    public void land() {

        log.info(this.name + " is landing");
    }

    public void taxi() {
        log.info(this.name + " is taxing");
    }

    public void report() {
        log.info(this.name + " has " + this.seatsCount + "seats");
    }

}
