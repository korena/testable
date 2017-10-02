package com.korena.testable;


import com.korena.aircraft.model.Aircraft;
import com.korena.service.MaintenanceService;
import com.korena.testable.model.Boing_777;

public class Operations {

    private final MaintenanceService maintenance;

    public Operations(MaintenanceService maintenance) {
        this.maintenance = maintenance;
    }

    public void operate(Aircraft aircraft) {

        // It all starts here!
        // taxi
        aircraft.taxi();
        // takeoff
        aircraft.takeoff();
        // flip
        ((Boing_777) aircraft).flip();  // I know :/
        // land
        aircraft.land();
        // maintain
        maintenance.repair_engine(aircraft);
        maintenance.refuel(aircraft, 100);
        // report
        aircraft.report();
    }


}
