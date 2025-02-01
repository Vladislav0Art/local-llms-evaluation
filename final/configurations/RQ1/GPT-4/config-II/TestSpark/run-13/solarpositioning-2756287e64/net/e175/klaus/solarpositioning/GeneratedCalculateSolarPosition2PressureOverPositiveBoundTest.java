package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition2PressureOverPositiveBoundTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition2PressureOverPositiveBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 3001, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter pressure out of range.", e.getMessage());
        }
    }

}