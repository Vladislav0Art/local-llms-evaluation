package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithFourParametersTest {

    @Test
    public void calculateSolarPositionWithFourParametersTest() {
        ZonedDateTime date = LocalDateTime.of(2020, 6, 20, 0, 0).atZone(ZoneId.of("UTC"));
        double latitude = 50.1109;
        double longitude = 8.6821;
        double deltaT = 68.8033;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
        // Please include proper assertions based on your method's business logic and expected results.
    }

}