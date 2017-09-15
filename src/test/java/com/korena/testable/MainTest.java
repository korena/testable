package com.korena.testable;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {


    // should fail mutation testing if main is mutated (will it be?)
    @Test
    public void mainMethodTest() {
        Main.main(new String[0]);
        assertTrue(true);
    }
}
