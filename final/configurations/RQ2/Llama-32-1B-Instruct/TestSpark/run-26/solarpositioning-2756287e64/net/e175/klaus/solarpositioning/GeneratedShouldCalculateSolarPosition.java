package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedShouldCalculateSolarPosition {

    @Test
    public void shouldCalculateSolarPosition() {
        verify(SolarPositionCalculator.class).calculateSolarPosition(anyDate(), "2022-01-01");
    }

}