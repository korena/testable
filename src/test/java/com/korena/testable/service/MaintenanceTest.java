package com.korena.testable.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.korena.testable.model.Aircraft;
import com.korena.testable.model.Boing_777;
import java.time.Instant;
import org.junit.Test;

public class MaintenanceTest {

    private final Aircraft aircraft = new Boing_777("emirates", 200, 100);
    private final  Maintenance maintenanceService = new Maintenance();

    @Test
    public void refuelMaxedOutTest(){
        assertEquals(100, maintenanceService.refuel(aircraft, 200));
    }

    @Test
    public void refuelSuccessTest(){
        assertEquals(200, maintenanceService.refuel(aircraft, 100));
    }

    @Test
    public void repairSuccessTest(){
        aircraft.setLastMaintained(Instant.now().minusSeconds(172800L)); // 48 hours
        assertTrue(maintenanceService.repair_engine(aircraft));
    }

    @Test
    public void repairRejectTest(){
        aircraft.setLastMaintained(Instant.now().minusSeconds(3600L)); // 1 hour
        assertFalse(maintenanceService.repair_engine(aircraft));
    }

}
