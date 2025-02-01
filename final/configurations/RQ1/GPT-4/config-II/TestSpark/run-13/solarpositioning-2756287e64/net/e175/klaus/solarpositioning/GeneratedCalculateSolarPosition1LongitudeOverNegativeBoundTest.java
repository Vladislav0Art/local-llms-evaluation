package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition1LongitudeOverNegativeBoundTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition1LongitudeOverNegativeBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, -181, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter longitude out of range.", e.getMessage());
        }
    }

}