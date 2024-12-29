package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSolarPosition_6am {

    @Test
    public void testSolarPosition_6am() {
        double[] date = {2022, 1, 1, 0};
        double time = 15; // in hours

        SolarPosition solarPosition = new SolarPosition(date, time);
        assertEquals(7.5, solarPosition.getHour(), 0.01),  // hour from 0-23
                "Incorrect hour";
    }

}