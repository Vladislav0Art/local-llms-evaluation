package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithoutPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithoutPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 10.0;
        double deltaT = 10.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

}