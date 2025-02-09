package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithFourParametersTest2 {

    @Test
    public void calculateSolarPositionWithFourParametersTest2() {
        ZonedDateTime date = ZonedDateTime.of(1950, 6, 21, 12, 0, 0, 0, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        double latitude = -34.6037, longitude = -58.3816, deltaT = 34.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull("Calculation of solar position should return a value.", result);
    }

}