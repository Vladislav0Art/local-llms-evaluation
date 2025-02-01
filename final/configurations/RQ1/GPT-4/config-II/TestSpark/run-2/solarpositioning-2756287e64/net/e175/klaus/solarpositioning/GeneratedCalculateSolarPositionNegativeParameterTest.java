package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionNegativeParameterTest {

    @Test
    public void calculateSolarPositionNegativeParameterTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 3, 25, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = -50.00;
        double longitude = -70.00;
        double deltaT = -120;
        double pressure = 900;
        double temperature = -10;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(328.8869, result.getAzimuth(), 0.1);
        assertEquals(20.7395, result.getZenithAngle(), 0.1);
    }

}