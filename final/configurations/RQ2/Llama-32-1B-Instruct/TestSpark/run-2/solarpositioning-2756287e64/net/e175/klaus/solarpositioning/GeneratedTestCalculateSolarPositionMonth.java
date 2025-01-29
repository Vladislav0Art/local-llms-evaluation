package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPositionMonth {

    @Test
    public void testCalculateSolarPositionMonth() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        int[] months = {January, February, March};
        for (int i : months) {
            int result = calculator.calculateSolarPosition(i + " 2024-01-15", null);
            assertEquals(23, result);
        }
    }

}