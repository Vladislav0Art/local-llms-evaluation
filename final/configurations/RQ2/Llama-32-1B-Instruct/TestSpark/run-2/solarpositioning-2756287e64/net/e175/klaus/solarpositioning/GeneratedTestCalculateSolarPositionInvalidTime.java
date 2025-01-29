package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionInvalidTime {

    @Test
    public void testCalculateSolarPositionInvalidTime() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        String[] dates = {"2024-01-15 00:00", "not-a-date"};
        for (String date : dates) {
            try {
                int result = calculator.calculateSolarPosition(date, null);
                fail("Expected exception not thrown");
            } catch (Exception e) {
            }
        }
    }

}