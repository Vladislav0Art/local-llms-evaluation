package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionNullDate {

    @Test
    public void testCalculateSolarPositionNullDate() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        String[] dates = {"2024-01-15", null};
        for (String date : dates) {
            try {
                int result = calculator.calculateSolarPosition(date, null);
                fail("Expected exception not thrown");
            } catch (Exception e) {
            }
        }
    }

}