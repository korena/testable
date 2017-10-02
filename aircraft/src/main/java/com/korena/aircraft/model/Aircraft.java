package com.korena.aircraft.model;

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

    public Aircraft(String name, int seats_count, int fuel_level) {
        this.name = name;
        this.seatsCount = seats_count;
        this.fuelLevel = fuel_level;
    }

    public String takeoff() {
        log.info(this.name + " is taking off");
        return String.format("%s is taking off", this.name);
    }

    public String land() {
        log.info(this.name + " is landing");
        return String.format("%s is landing", this.name);
    }

    public String taxi() {
        log.info(this.name + " is taxing");
        return String.format("%s is taxiiiiinnngah", this.name);
    }

    public String report() {
        log.info(this.name + " has " + this.seatsCount + "seats");
        return this.name + " has " + this.seatsCount + "seats";
    }

}