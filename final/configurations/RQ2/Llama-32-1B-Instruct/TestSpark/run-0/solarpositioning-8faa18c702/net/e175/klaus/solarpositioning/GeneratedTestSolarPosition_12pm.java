package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSolarPosition_12pm {

    @Test
    public void testSolarPosition_12pm() {
        double[] date = {2022, 1, 1, 0};
        double time = 18; // in hours

        SolarPosition solarPosition = new SolarPosition(date, time);
        assertEquals(16.0, solarPosition.getHour(), 0.01),  // hour from 0-23
                "Incorrect hour";
    }

}