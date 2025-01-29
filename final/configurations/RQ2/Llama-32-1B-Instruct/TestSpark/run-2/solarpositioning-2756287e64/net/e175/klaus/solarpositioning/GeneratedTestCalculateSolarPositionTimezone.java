package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionTimezone {

    @Test
    public void testCalculateSolarPositionTimezone() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Timezone timezone = Timezone.of("UTC+1");
        int result = calculator.calculateSolarPosition("2024-01-15", timezone);
        assertEquals(23, result);
    }

}