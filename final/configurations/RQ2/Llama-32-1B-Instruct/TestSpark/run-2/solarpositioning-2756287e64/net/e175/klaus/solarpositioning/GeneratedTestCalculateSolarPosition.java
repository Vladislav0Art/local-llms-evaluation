package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPosition {

    @Test
    public void testCalculateSolarPosition() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();
        int result = calculator.calculateSolarPosition("2024-01-15", "London");
        assertEquals(23, result);
    }

}