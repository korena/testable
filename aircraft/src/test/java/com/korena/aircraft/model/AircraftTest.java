package com.korena.aircraft.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AircraftTest {

    private Aircraft aircraft;

    @Before
    public void setup() {
        aircraft = new Aircraft("name", 100, 200) {
            public void flip() {
                System.out.println(getName() + " is flipping like a boss!");
            }
        };
    }

    @Test
    public void testAircraftTakeOff() {
        assertEquals("name is taking off", aircraft.takeoff());
    }

    @Test
    public void testAircraftLanding() {
        assertEquals("name is landing", aircraft.land());
    }

}
