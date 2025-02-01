package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionInvalidPressureTemperatureTest {

    @Test
    public void calculateSolarPositionInvalidPressureTemperatureTest() {
        ZonedDateTime testDate = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 20.0;
        double deltaT = 10.0;
        double pressure = 5000.0;
        double temperature = -300.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}