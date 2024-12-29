package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

public class GeneratedCalculateSolarPosition_ValidInputs_Calculate {

    public enum AzimuthZenithAngle {
        SOFTMAX,
        DEFAULT,
        OTHER
    }

    public enum GeneratedAzimuthZenithAngle extends AzimuthZenithAngle {
        SOFTMAX, DEFAULT, OTHER
    }

    @Test
    public void calculateSolarPosition_ValidInputs_Calculate() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        Grena3.AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertNotNull(angle);
    }

}