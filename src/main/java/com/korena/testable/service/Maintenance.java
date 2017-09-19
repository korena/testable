package com.korena.testable.service;

import com.korena.testable.model.Aircraft;
import java.time.Instant;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Maintenance implements MaintenanceService {

    public int refuel(Aircraft aircraft, int amount) {
        log.info("Aircraft " + aircraft.getName() + "is refueling to " + amount);

        if ((aircraft.getFuelLevel() + amount) <= aircraft.getFuelCapacity()) {
            aircraft.setFuelLevel(aircraft.getFuelLevel() + amount);
        }
        return aircraft.getFuelLevel();
    }

    public boolean repair_engine(Aircraft aircraft) {
        Instant now = Instant.now();
        Instant maintAllowedPeriod = now.minusSeconds(86400L);  // 24 hours
        Instant lastMaintainedOn = aircraft.getLastMaintained();
        if (lastMaintainedOn.compareTo(maintAllowedPeriod) < 0) {
            log.info("Aircraft last maintained on " + aircraft.getLastMaintained());
            log.info("That's further than " + maintAllowedPeriod + ", maintaining ...");
            aircraft.setLastMaintained(Instant.now());
            return true;
        } else {
            log.info("Aircraft last maintained on " + aircraft.getLastMaintained());
            log.info("That's closer than " + maintAllowedPeriod + ", skipping maintenance ...");
            return false;
        }
    }

}
