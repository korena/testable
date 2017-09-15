package com.korena.testable;

import com.korena.testable.model.Aircraft;
import com.korena.testable.model.Boing_777;
import com.korena.testable.service.Maintenance;

public class Main {

    public static void main(String[] args) {

        // It all starts here!
        Aircraft boing_777 = new Boing_777("Emirates", 200, 100);
        Maintenance maintenanceService = new Maintenance();
        // taxi
        boing_777.taxi();
        // takeoff
        boing_777.takeoff();
        // flip
        ((Boing_777) boing_777).flip();
        // land
        boing_777.land();
        // maintain
        maintenanceService.repair_engine(boing_777);
        maintenanceService.refuel(boing_777, 100);
        // report
        boing_777.report();
    }


}
