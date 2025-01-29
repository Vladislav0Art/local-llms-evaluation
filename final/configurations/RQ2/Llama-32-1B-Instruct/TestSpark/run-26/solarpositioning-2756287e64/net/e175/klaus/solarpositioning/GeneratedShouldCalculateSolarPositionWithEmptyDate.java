package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedShouldCalculateSolarPositionWithEmptyDate {

    @Test
    public void shouldCalculateSolarPositionWithEmptyDate() {
        verify(SolarPositionCalculator.class).calculateSolarPosition(any(LocalDate.), "");
    }

}