package com.korena.testable.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.korena.aircraft.model.Aircraft;
import com.korena.testable.config.AircraftConfig;
import com.korena.testable.config.MaintenanceConfig;
import com.korena.testable.config.OperationsConfig;
import com.korena.testable.config.props.AircraftProps;
import java.time.Instant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AircraftConfig.class, MaintenanceConfig.class, OperationsConfig.class})
@EnableConfigurationProperties({AircraftProps.class})
@ActiveProfiles({"dev"})
public class MaintenanceTest {

    @Autowired
    private  Aircraft aircraft;
    @Autowired
    private  Maintenance maintenanceService;

    @Test
    public void refuelMaxedOutTest(){
        aircraft.setFuelLevel(100);
        assertEquals(100, maintenanceService.refuel(aircraft, 200));
    }

    @Test
    public void refuelSuccessTest(){
        aircraft.setFuelLevel(100);
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
