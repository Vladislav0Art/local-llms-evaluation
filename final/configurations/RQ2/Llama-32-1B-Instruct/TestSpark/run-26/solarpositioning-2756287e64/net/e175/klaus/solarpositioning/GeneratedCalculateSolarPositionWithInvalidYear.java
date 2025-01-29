package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSolarPositionWithInvalidYear {

    @Test
    public void calculateSolarPositionWithInvalidYear() {
        assertThrows(UnsupportedOperationException.class, () -> SolarPositionCalculator.calculateSolarPosition(null, "2022-01-01"));
    }

}