package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionWithRefractionTest {

    @Test
    public void calculateSolarPositionWithRefractionTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 3, 25, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 69.184;
        double pressure = 1000;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(180.0448, result.getAzimuth(), 0.1);
        assertEquals(42.1416, result.getZenithAngle(), 0.1);
    }

}