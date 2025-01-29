package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionDay {

    @Test
    public void testCalculateSolarPositionDay() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        int[] days = {1, 2, 3};
        for (int i : days) {
            int result = calculator.calculateSolarPosition(i + " 2024-01-15", null);
            assertEquals(23, result);
        }
    }

}