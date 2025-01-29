package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSolarPositionWithInvalidUnit {

    @Test
    public void calculateSolarPositionWithInvalidUnit() {
        assertThrows(UnsupportedOperationException.class, () -> SolarPositionCalculator.calculateSolarPosition(null, "2022-01-01", "cm"));
    }

}