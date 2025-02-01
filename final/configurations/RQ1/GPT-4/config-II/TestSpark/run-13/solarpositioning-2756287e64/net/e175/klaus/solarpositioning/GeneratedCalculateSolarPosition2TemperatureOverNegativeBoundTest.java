package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition2TemperatureOverNegativeBoundTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition2TemperatureOverNegativeBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 0, -274);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter temperature out of range.", e.getMessage());
        }
    }

}