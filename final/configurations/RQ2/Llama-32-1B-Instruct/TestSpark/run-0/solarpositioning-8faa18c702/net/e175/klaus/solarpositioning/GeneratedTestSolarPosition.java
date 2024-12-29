package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSolarPosition {

    @Test
    public void testSolarPosition() {
        double[] date = {2022, 1, 1, 0};
        double time = 9; // in hours

        SolarPosition solarPosition = new SolarPosition(date, time);
        assertEquals(20.0, solarPosition.getHour(), 0.01),  // hour from 0-23
                "Incorrect hour";
    }

}