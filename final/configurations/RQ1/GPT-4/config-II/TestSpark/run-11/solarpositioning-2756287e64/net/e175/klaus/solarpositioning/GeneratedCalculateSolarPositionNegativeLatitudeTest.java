package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionNegativeLatitudeTest {

    @Test
    public void calculateSolarPositionNegativeLatitudeTest() {
        ZonedDateTime testDate = ZonedDateTime.now();
        double latitude = -10.0;
        double longitude = 20.0;
        double deltaT = 10.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}