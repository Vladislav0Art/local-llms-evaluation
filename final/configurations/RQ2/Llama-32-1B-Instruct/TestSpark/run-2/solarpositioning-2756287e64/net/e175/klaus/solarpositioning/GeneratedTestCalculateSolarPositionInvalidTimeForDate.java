package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionInvalidTimeForDate {

    @Test
    public void testCalculateSolarPositionInvalidTimeForDate() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        String[] dates = {"2024-01-15", "London, UTC+1"};
        for (String date : dates) {
            try {
                int result = calculator.calculateSolarPosition(date + ":00", null);
                fail("Expected exception not thrown");
            } catch (Exception e) {
            }
        }
    }

}