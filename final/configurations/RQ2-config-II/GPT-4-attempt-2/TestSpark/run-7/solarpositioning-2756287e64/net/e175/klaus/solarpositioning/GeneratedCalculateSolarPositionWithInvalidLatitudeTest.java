package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime dateTime = LocalDateTime.of(2022, 9, 9, 22, 0).atZone(ZoneId.systemDefault());

        try {
            Grena3.calculateSolarPosition(dateTime, 95.0, 13.4050, 64.3);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid latitude.", e.getMessage());
        }
    }

}