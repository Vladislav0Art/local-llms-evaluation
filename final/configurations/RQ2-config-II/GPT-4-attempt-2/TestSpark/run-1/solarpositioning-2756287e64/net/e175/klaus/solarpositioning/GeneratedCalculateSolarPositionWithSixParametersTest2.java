package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithSixParametersTest2 {

    @Test
    public void calculateSolarPositionWithSixParametersTest2() {
        ZonedDateTime date = ZonedDateTime.of(2010, 9, 21, 18, 0, 0, 0, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        double latitude = 40.7128, longitude = -74.0060, deltaT = 68.0, pressure = 1013.25, temperature = 28.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Calculation of solar position should return a value.", result);
    }

}