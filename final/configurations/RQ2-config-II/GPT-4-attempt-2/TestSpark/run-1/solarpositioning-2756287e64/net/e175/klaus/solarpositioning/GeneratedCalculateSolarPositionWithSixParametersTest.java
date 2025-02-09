package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithSixParametersTest {

    @Test
    public void calculateSolarPositionWithSixParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2023, 3, 21, 6, 0, 0, 0, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        double latitude = 48.8566, longitude = 2.3522, deltaT = 69.0, pressure = 1013.25, temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Calculation of solar position should return a value.", result);
    }

}