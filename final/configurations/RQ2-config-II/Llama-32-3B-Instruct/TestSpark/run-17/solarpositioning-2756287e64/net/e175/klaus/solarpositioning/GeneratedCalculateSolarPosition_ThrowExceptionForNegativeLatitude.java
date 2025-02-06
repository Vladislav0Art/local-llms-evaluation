package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_ThrowExceptionForNegativeLatitude {

    @Test
    public void calculateSolarPosition_ThrowExceptionForNegativeLatitude() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -48.8567;
        double longitude = 2.3508;
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(
                Mockito.mock(Double.class),
                Mockito.mock(Double.class)
        );
        Grena3 calculateSolarPosition = new Grena3();
        try {
            calculateSolarPosition.calculateSolarPosition(date, latitude, longitude);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
        }
    }

}