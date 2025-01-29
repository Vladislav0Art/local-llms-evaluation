package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionInvalidDate {

    @Test
    public void testCalculateSolarPositionInvalidDate() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        String[] dates = {"Invalid Date", "2024-02-30"};
        for (String date : dates) {
            try {
                int result = calculator.calculateSolarPosition(date, null);
                fail("Expected exception not thrown");
            } catch (Exception e) {
            }
        }
    }

}