package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionFiveParamTest {

    @Test
    public void calculateSolarPositionFiveParamTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 53.5511;
        double longitude = 9.9937;
        double deltaT = 69.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Asserting that the result is not null
        assertNotNull(result);

        // Asserting that azimuth and zenith angle are within acceptable ranges
        assertTrue(result.getAzimuth() >= 0 && result.getAzimuth() <= 360);
        assertTrue(result.getZenithAngle() >= 0 && result.getZenithAngle() <= 90);
    }

}