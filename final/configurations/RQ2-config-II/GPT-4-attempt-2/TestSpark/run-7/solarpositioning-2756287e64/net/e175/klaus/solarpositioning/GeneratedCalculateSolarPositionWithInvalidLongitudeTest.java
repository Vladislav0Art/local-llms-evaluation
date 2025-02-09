package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime dateTime = LocalDateTime.of(2022, 9, 9, 22, 0).atZone(ZoneId.systemDefault());

        try {
            Grena3.calculateSolarPosition(dateTime, 52.5200, 190.0, 64.3);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid longitude.", e.getMessage());
        }
    }

}