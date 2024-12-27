package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDefaultPressureTemperatureZonedDateTimeLatitudeLongitudeDeltaTTest() {
        // From the code provided, the actual implementation of calculateSolarPosition is not visible
        // Thus, we don't know what kind of value we are expecting. We will only verify that a non-null object is returned
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 15.0;
        double deltaT = 10.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionZonedDateTimeLatitudeLongitudeDeltaTPressureTemperatureTest() {
        // From the code provided, the actual implementation of calculateSolarPosition is not visible
        // Thus, we don't know what kind of value we are expecting. We will only verify that a non-null object is returned
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 15.0;
        double deltaT = 10.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}