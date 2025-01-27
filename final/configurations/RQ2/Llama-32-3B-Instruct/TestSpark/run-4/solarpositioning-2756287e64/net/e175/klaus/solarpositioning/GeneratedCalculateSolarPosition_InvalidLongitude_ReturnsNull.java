package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class GeneratedCalculateSolarPosition_InvalidLongitude_ReturnsNull {

    @Test
    public void calculateSolarPosition_InvalidLongitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = Double.NaN;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

}