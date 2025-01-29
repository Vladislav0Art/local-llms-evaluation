package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionInvalidTimezone {

    @Test
    public void testCalculateSolarPositionInvalidTimezone() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        Timezone timezone = Timezone.of("not-a-timezone");
        int result = calculator.calculateSolarPosition("2024-01-15", timezone);
        fail("Expected exception not thrown");
    }

}