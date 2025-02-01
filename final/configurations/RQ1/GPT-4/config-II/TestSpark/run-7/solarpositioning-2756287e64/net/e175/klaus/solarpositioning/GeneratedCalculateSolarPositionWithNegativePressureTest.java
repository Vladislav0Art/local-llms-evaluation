package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedCalculateSolarPositionWithNegativePressureTest {

    @Test
    public void calculateSolarPositionWithNegativePressureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 25.7617;
        double longitude = 80.1918;
        double deltaT = 69.184;
        double pressure = -10;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
        assertTrue(result instanceof AzimuthZenithAngle);
    }

}