package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.OptionalDouble;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionWithInvalidLatitude_ReturnsNull {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithInvalidLatitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertEquals(null, result);
    }

}