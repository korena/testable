package com.korena.service;

import com.korena.aircraft.model.Aircraft;

public interface MaintenanceService {

    int refuel(Aircraft aircraft, int amount);

    boolean repair_engine(Aircraft aircraft);

}
