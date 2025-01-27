package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class GeneratedCalculateSolarPosition_ValidDateAndInputWithPressure_ReturnsNonNull {

    @Test
    public void calculateSolarPosition_ValidDateAndInputWithPressure_ReturnsNonNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 101325);

        assertNotNull(angle);
    }

}