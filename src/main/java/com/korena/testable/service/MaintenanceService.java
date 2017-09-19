package com.korena.testable.service;

import com.korena.testable.model.Aircraft;

public interface MaintenanceService {

    int refuel(Aircraft aircraft, int amount);

    boolean repair_engine(Aircraft aircraft);

}
