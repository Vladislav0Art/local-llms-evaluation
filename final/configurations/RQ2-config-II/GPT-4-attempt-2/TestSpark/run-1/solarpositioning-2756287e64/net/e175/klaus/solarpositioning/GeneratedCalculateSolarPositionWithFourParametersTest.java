package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithFourParametersTest {

    @Test
    public void calculateSolarPositionWithFourParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        double latitude = 52.5200, longitude = 13.4050, deltaT = 67.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull("Calculation of solar position should return a value.", result);
    }

}