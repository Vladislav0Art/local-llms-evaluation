package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_ExpectedExceptionWhenDateIsInThePast {

    @Test
    public void calculateSolarPosition_ExpectedExceptionWhenDateIsInThePast() {
        // Given
        ZonedDateTime date = ZonedDateTime.of(2022, 5, 31, 12, 0, 0, 0, ZoneOffset.UTC);

        // When
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 10));
    }

}