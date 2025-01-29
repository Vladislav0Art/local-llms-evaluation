package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionTimeZoneNone {

    @Test
    public void testCalculateSolarPositionTimeZoneNone() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Timezone timezone = null;
        int result = calculator.calculateSolarPosition("2024-01-15", timezone);
        assertEquals(23, result);
    }

}