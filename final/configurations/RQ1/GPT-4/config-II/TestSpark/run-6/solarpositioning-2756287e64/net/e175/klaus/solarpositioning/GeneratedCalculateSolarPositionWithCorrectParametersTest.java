package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithCorrectParametersTest {

    @Test
    public void calculateSolarPositionWithCorrectParametersTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 10.0;
        double deltaT = 10.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(
                date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}