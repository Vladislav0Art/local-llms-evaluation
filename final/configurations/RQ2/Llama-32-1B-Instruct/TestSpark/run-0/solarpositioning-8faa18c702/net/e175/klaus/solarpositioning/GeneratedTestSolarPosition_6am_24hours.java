package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSolarPosition_6am_24hours {

    @Test
    public void testSolarPosition_6am_24hours() {
        double[] date = {2022, 1, 1, 24};
        double time = 15; // in hours

        SolarPosition solarPosition = new SolarPosition(date, time);
        assertEquals(8.5, solarPosition.getHour(), 0.01),  // hour from 0-23
                "Incorrect hour";
    }

}