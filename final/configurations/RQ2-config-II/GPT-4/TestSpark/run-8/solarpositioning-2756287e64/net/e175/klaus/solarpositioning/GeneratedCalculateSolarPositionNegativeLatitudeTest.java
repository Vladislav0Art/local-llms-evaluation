package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionNegativeLatitudeTest {

    @Test
    public void calculateSolarPositionNegativeLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -40.7128;
        double longitude = -74.0060;
        double deltaT = 68.8033;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

}